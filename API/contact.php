<?php

include 'connection.php';

if($_POST){

    //POST DATA
    $orderId = filter_input(INPUT_POST, 'orderId', FILTER_SANITIZE_STRING);
    $password = filter_input(INPUT_POST, 'password', FILTER_SANITIZE_STRING);
    $email = filter_input(INPUT_POST, 'email', FILTER_SANITIZE_STRING);
    $phone = filter_input(INPUT_POST, 'phone', FILTER_SANITIZE_STRING);
    $chat = filter_input(INPUT_POST, 'chat', FILTER_SANITIZE_STRING);

    $response = [];

    //Cek username didalam databse
    $userQuery = $connection->prepare("SELECT * FROM contact where password = ?");
    $userQuery->execute(array($password));

    // Cek username apakah ada tau tidak
    if($userQuery->rowCount() != 0){
        // Beri Response
        $response['status']= false;
        $response['message']='Akun sudah digunakan';
    } else {
        $insertAccount = 'INSERT INTO contact (chat,password, orderId, email, phone) values (:chat, :password, :orderId, :email, :phone)';
        $statement = $connection->prepare($insertAccount);

        try{
            //Eksekusi statement db
            $statement->execute([
                ':chat' => $chat,
                ':password' => md5($password),
                ':orderId' => $orderId,
                ':email' => $email,
                ':phone' => $phone
            ]);

            //Beri response
            $response['status']= true;
            $response['message']='Pesan Telah Terkirim';
            $response['data'] = [
                ':chat' => $chat,
                ':orderId' => $orderId,
                'email' => $email,
                'phone' => $phone
            ];
        } catch (Exception $e){
            die($e->getMessage());
        }

    }
    
    //Jadikan data JSON
    $json = json_encode($response, JSON_PRETTY_PRINT);

    //Print JSON
    echo $json;
}