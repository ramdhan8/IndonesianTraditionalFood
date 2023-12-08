<?php
include 'connection.php';

$koneksi = new mysqli($host, $username, $password, $dbname);

if ($koneksi->connect_error) {
 die("Koneksi Gagal: " . $koneksi->connect_error);
} 

$sql = "SELECT foodName, foodPrice, foodDesc, gambar_url FROM `food` WHERE foodCategorieId=4";
$result = $koneksi->query($sql);

if ($result->num_rows >0) {

 while($row[] = $result->fetch_assoc()) {
 
 $tem = $row;
 
 $json = json_encode($tem);
 
 
 }
 
} else {
 echo "0 results";
}
 echo $json;
$koneksi->close();
?>