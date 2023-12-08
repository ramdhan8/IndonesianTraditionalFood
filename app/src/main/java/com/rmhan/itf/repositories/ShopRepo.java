package com.rmhan.itf.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.rmhan.itf.model.menu.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Beras Kencur", 3000, true, "https://asset.kompas.com/crops/eJ2KRSLFSPr-kbSRaKoE-samJW8=/0x279:841x839/750x500/data/photo/2021/10/16/616a392f74672.jpeg" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Kunyit Asam", 3000, true, "https://asset.kompas.com/crops/T1JuxEAJY2kQk00BovNxREoLSfY=/87x26:915x578/750x500/data/photo/2022/03/13/622deacb7b22e.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Temulawak", 3000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQfolJ9XTJOvaODRJJsuLqf8OhRTivfpS07A&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Bakso", 10000, true, "https://cdns.klimg.com/merdeka.com/i/w/news/2020/03/11/1155066/540x270/8-cara-membuat-kuah-bakso-beragam-variasi-enak-dan-praktis.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Mie Ayam", 12000, true, "https://awsimages.detik.net.id/community/media/visual/2022/10/12/resep-mie-ayam-kecap_43.jpeg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Nasi Goreng", 9000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbQwpF_Fvl5BGbqccIrFxuUP4fM9GZ23h7PQ&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Nasi Padang", 10000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReaqbOcM7EoJ11ZV9jfbin_cxEnj0p6mGFgw&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Jahe", 3000, true, "https://www.madaninews.id/wp-content/uploads/2019/09/temulawak-manfaat-640x400.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Es Teh", 3000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1mq6s0jFjA-o36DM4yM69iwQM4D79lBJV9A&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Kopi Hitam", 5000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmibQPudl_JDTuIV5N7eLkrhlkQLCLPHwAkw&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Nasi Rawon", 15000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHVJUV23COONglROI2o2qihntxy7lsKXwfQw&usqp=CAU" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Pahitan", 3000, true, "https://www.madaninews.id/wp-content/uploads/2019/09/article_358-681x358.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Galian Singset", 3000, true, "https://www.madaninews.id/wp-content/uploads/2019/09/bunda-ini-cara-bikin-jamu-galian-singset-yang-bikin-sehat-iUM.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Es Jeruk", 4000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8eKkTnUJk28jowCn5GrRWUEM48Q16tarXnw&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Es Degan", 5000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4gzxLQ4lCV-W15snh_-4qksKpNB2B4Nj2XA&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Es Dawet", 6000, true, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8oURSsL0XS6WHSCFUsOJZ6UQPNjHMZUPOdQ&usqp=CAU"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sambal Terasi", 2000, true, "https://asset.kompas.com/crops/PBUEFI5RBdK3gY6RGynmQ4WlS2Q=/0x0:1000x667/750x500/data/photo/2020/10/04/5f794f9ee502d.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sambal Dabu-Dabu", 2000, true, "https://asset.kompas.com/crops/EUQ9YL0J4L24u36BO81mqBdoFAw=/0x0:1000x667/750x500/data/photo/2020/11/03/5fa0cb244c83f.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sambal Matah", 2000, true, "https://asset.kompas.com/crops/DKz3ia0kTEncvmN-yvvb1uXk47o=/0x610:1500x1610/750x500/data/photo/2019/07/05/2490389343.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sambal Ijo", 2000, true, "https://asset.kompas.com/crops/i8XPicsLEUrsaUTQpb62FK7kU_g=/0x0:1000x667/750x500/data/photo/2020/08/24/5f431f6307111.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sambal Andaliman", 2000, true, "https://asset.kompas.com/crops/cifCt6YxaXvr-zTA13ivbh7_510=/0x0:1000x667/750x500/data/photo/2020/07/14/5f0d78239303b.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sambal Tumpang", 2000, true, "https://asset.kompas.com/crops/v7z242-28nnAkviWHUIFQKWi_Lk=/0x36:1000x703/750x500/data/photo/2020/08/04/5f29594a93088.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sayur Daun Labu Kuning", 5000, true, "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/11/01/resep-sayur-daun-labu-rebon-saj-20221101055726.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sayur Daun Labu Teri", 5000, true, "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/12/27/resep-sayur-daun-labu-teri-menu-20221227012249.jpg" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Sayur Asem Kacang Merah", 5000, true, "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/12/29/resep-sayur-asam-kacang-merah-s-20221229020556.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sayur Kangkung Kuah Santan", 5000, true, "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2022/11/23/resep-sayur-kangkung-santan-men-20221123064127.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sayur Asem Kuah Kuning", 5000, true, "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2021/03/23/resep-sayur-asem-kuah-kuning-me-20210323063031.jpg"));
        productList.add(new Product(UUID.randomUUID().toString(), "Sup Buncis Sayap", 5000, true, "https://asset-a.grid.id/crop/0x0:0x0/700x465/photo/2021/03/23/resep-sop-buncis-sayap-hidangan-20210323083711.jpg"));
        mutableProductList.setValue(productList);
    }
}
