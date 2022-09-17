package com.cowok.hijrah.chapter4topic3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelProduct : ViewModel() {
    val list = arrayListOf(
        Product(
            "Asus ZenBook 14 OLED",
            R.drawable.laptop_satu,
            15,
            20000000,
            "Laptop Asus ZenBook 14 OLED ini tersedia dalam tiga pilihan warna yakni hitam, perak dan biru.\n" +
                    "\n" +
                    "Laptop Asus ZenBook 14 OLED baru memiliki layar OLED 2.8K 14 inci, dengan rasio aspek 16:10 dan refresh rate 90Hz. Bezel layar yang sangat kecil juga cocok dengan desain modern untuk memberikan tampilan yang elegan pada laptop.\n" +
                    "\n" +
                    "Akan ada konfigurasi beraroma AMD dan Intel, dengan yang pertama mendukung RAM LPDDR4X hingga 16GB. Sementara yang kedua, hadir dengan LPDDR5 16GB.\n" +
                    "\n" +
                    "Keduanya akan tersedia dengan penyimpanan hingga 1TB. Asus ZenBook 14 OLED hanya akan berbobot 1,4kg dan dikemas dalam baterai 75Whr.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 14 inci, 16:10 aspect ratio, 2880 x 1800 resolution, 90Hz refresh rate, 0.2 ms response time, 100% DCI-P3 color gamut\n" +
                    "Processor: AMD Ryzen ™ 9 5900HX, Intel ® Core ™ i7 generasi ke-12\n" +
                    "Graphic Card: Up to Intel ® Iris X e graphics\n" +
                    "RAM: LPDDR4X hingga 16GB dan LPDDR5 16GB.\n" +
                    "Storage: hingga 1TB\n" +
                    "Harga : Rp 20jutaan"
        ),
        Product(
            "Asus ROG Flow Z13",
            R.drawable.laptop_dua,
            20,
            27000000,
            "ROG Flow Z13 adalah laptop gaming baru, melanjutkan lini Flow yang pertama kali dibuat oleh laptop ROG Flow X13 tahun lalu.\n" +
                    "\n" +
                    "Model baruni i secara teknis adalah tablet, tetapi dilengkapi dengan keyboard clip-on magnetik yang dapat mengubahnya menjadi laptop.\n" +
                    "\n" +
                    "Asus mengemasnya dengan prosesor Intel Core i9-12900H Alder Lake dan GPU RTX 3050 Ti yang membuatnya cukup kuat untuk gaming level pemula.\n" +
                    "\n" +
                    "ROG Flow Z13 juga mendukung GPU eksternal XG Mobile dari Asus. Setelah dicolokkan ke tablet, kamu bisa meningkatkan kinerja grafis, dengan opsi GPU mulai dari Nvidia RTX 3080.\n" +
                    "\n" +
                    "Artinya, kamu bisa menggunakan Flow Z13 sebagai tablet ultra-portabel, dengan berat hanya 1kg dan ketebalan 12mm. Kamu juga bisa menggunakannya sebagai laptop gaming yang bertenaga saat dipasangkan dengan XG Mobile.\n" +
                    "\n" +
                    "ROG Flow Z13 dapat dikonfigurasi dengan resolusi Full HD atau 4K saat checkout, dengan spesifikasi memori dan penyimpanan maksimal masing-masing 32GB LPDDR5 RAM dan 1TB SSD.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: IPS berukuran 13,4 inci aspect ratio 16:10, resolusi 4K dan refresh rate 60 Hz, atau Full HD dengan refresh rate 120 Hz.\n" +
                    "Processor: Intel Core i9-12900H Alder Lake, mendukung GPU eksternal XG Mobile dari Asus\n" +
                    "Graphic Card: RTX 3050 Ti,\n" +
                    "RAM: 32GB LPDDR5\n" +
                    "Storage: 1TB\n" +
                    "Harga : mulai dari Rp 27jutaan"
        ),
        Product(
            "ROG Zephyrus G14 2022",
            R.drawable.laptop_tiga,
            12,
            30000000,
            "Jajaran laptop Asus ROG Zephyrus G14 menuai kesukesan besar. Banyak orang menyukai laptop gaming berkat desain ultra-portabelnya. Asus akan menyegarkan G14 untuk tahun 2022, dengan spesifikasi yang ditingkatkan dan sedikit perubahan pada desain.\n" +
                    "\n" +
                    "ROG Zephyrus G14 2022 akan mengemas CPU Ryzen 9 6900HS dan mobile GPU Radeon RX 6800S baru dari AMD dipadu RAM 16GB dan penyimpanan hingga 1TB.\n" +
                    "\n" +
                    "Laptop juga didukung Memori DDR5 dengan peningkatan hingga 16GB. Namun opsi RAM DDR4 juga akan disertakan bagi mereka yang ingin berhemat.\n" +
                    "\n" +
                    "ASUS telah menambahkan panel layar 16:10 baru ke Zephyrus G14 baru, dan semacam webcam di bezel atas, mengatasi salah satu kelemahan laptop di generasi sebelumnya. Mereka mengemas bezel samping dan bawah untuk tampilan yang lebih bergaya juga.\n" +
                    "\n" +
                    "Asus juga mengklaim telah meningkatkan kecerahan hingga 400 nits untuk model Full HD, dan hingga 500 nits untuk konfigurasi QHD. Respons time telah dikurangi menjadi 3ms, yang seharusnya menjadi keuntungan bagi para gamer kompetitif.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: FHD (1920 x 1080 piksel)/WQHD (2560 x 1440 piksel)\n" +
                    "Processor: AMD Ryzen 9 5900HS.\n" +
                    "Graphic Card: mobile GPU Radeon RX 6800S\n" +
                    "RAM: 16GB DDR4\n" +
                    "Storage: 1TB SSD\n" +
                    "Harga : Rp 30jutaan"
        ),
        Product(
            "Asus Zephyrus Duo 16",
            R.drawable.laptop_empat,
            43,
            38000000,
            "Ini adalah iterasi terbaru dari laptop gaming Asus ROG Zephyrus Duo. Jajaran seri ini memiliki fitur pengaturan layar ganda, dengan layar kedua ditambahkan tepat di atas keyboard yang sangat berguna untuk streamer.\n" +
                    "\n" +
                    "Untuk model 2022 yang baru, layar kedua telah dipindahkan sedikit lebih dekat ke layar utama, menyisakan ruang untuk panel kaca yang memungkinkanmu mengintip motherboard di dalam casing.\n" +
                    "\n" +
                    "Ia juga mendapatkan peningkatan kinerja, dengan CPU AMD Ryzen 9 6980HX dan GPU RTX 3080 Ti baru Nvidia. Memori DDR5 16GB dan SSD 4TB juga akan dipasangkan di sini.\n" +
                    "\n" +
                    "Asus Zephyrus Duo 16 akan memiliki layar 16 inci, dengan pilihan antara 4K pada panel 120Hz, atau Full HD pada layar 240Hz. Ada juga webcam IR yang ditempatkan di bezel atas.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 16-inch, WQUXGA(3840×2400) / WUXGA (1920×1200)\n" +
                    "Processor: AMD Ryzen 9 6980HX\n" +
                    "Graphic Card: Nvidia GeForce RTX 3080Ti\n" +
                    "RAM: 32GB DDR5-4800 SO-DIMM x 2 Max Capacity : 64GB\n" +
                    "Storage: 2TB + 2TB M.2 NVMe™ PCIe® 4.0 SSD (RAID 0)\n" +
                    "Harga : Rp 38jutaan"
        ),
        Product(
            "ASUS TUF Dash F15",
            R.drawable.laptop_lima,
            25,
            20000000,
            "Selanjutnya, ada laptop gaming ASUS TUF Dash F15 baru yang hadir dengan internal yang ditingkatkan untuk tahun 2022.\n" +
                    "\n" +
                    "Meskipun internal baru, casing keseluruhan terlihat identik dengan tahun lalu. Ia masih mempertahankan faktor bentuk aslinya dan ketebalan casing di bawah 20 mm.\n" +
                    "\n" +
                    "Untuk spesifikasinya, TUF Dash F15 yang baru memiliki prosesor Intel Core i7-12650H Generasi ke-12 dan GPU NVIDIA GeForce RTX 3070 dengan MUX Switch.\n" +
                    "\n" +
                    "ASUS juga menambahkan modul RAM 48GB DDR5 dengan kecepatan memori hingga 4800MHz bersama dengan PCIe 4.0 SSD ganda 2TB.\n" +
                    "\n" +
                    "Kamu bisa mengonfigurasinya dengan panel QHD 165 Hz hingga 15 inci dengan cakupan 100% color space DCI-P3. Sorotan lain dari laptop TUF Dash F15 termasuk dukungan Thunderbolt 4, USB Type-C Power Delivery up to 100W, dan lainnya.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 14.0″ FHD (1920 x 1080)\n" +
                    "Processor: Intel Core i7-12650H Generasi ke-12\n" +
                    "Graphic Card: NVIDIA GeForce RTX 3070 dengan MUX Switch\n" +
                    "RAM: 48GB\n" +
                    "Storage: 2 x M.2 SSD, up to 2 TB PCIe® 3.0 SSD, 256 GB / 512 GB / 1 TB M.2 PCIe® 3.0 Value SSD, 1 TB M.2 PCIe® 3.0 Performance SSD\n" +
                    "Harga : Rp 20jutaan"
        ),
        Product(
            "ASUS ZenBook 13 UX325E",
            R.drawable.laptop_enam,
            20,
            17000000,
            "ASUS Zenbook 13 UX345E hadir dengan layar OLED beresolusi Full HD gamut warna DCI-P3 100% yang akan menghadirkan warna dengan akurasi tajam.\n" +
                    "\n" +
                    "Ada juga sensor webcam yang bisa digunakan untuk melakukan video call dan membuka kunci dengan praktis dan kilat.\n" +
                    "\n" +
                    "Laptop ditenagai oleh prosesor Intel Core i7 generasi ke-11 yang kencang dipadu dengan Intel Iris Xe Graphics setara GPU diskrit entry-level. Bermain game dijamin lancar dengan perangkat satu ini.\n" +
                    "\n" +
                    "Kelebihan lain, bobotnya ringan hanya 1,14kg saja. Untuk meningkatkan performa, kamu bisa menghubungkan perangkat dengan eGPU melalui port Thunderbolt 4.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 13.3-inch OLED, FHD (1920 x 1080) 16:9, Glossy display, DCI-P3: 100%\n" +
                    "Processor: Intel® Core™ i7-1165G7 Processor 2.8 GHz (12M Cache, up to 4.7 GHz, 4 cores)\n" +
                    "Graphic Card: Intel® Iris Xe Graphics\n" +
                    "RAM: 16GB LPDDR4X on board\n" +
                    "Storage: 512GB M.2 NVMe™ PCIe® 3.0 SSD\n" +
                    "Harga : Rp 17jutaan"
        ),
        Product(
            "ASUS VivoBook 15 A516JA",
            R.drawable.laptop_tujuh,
            39,
            9000000,
            "Bagi yang mencari laptop ASUS terbaru 2022 dengan harga tidak terlalu mahal, ASUS VivoBook 14 A516JAO merupakan pilihan tepat dengan harga Rp 9jutaan saja.\n" +
                    "\n" +
                    "Spesifikasinya terbilang menarik dengan disematkannya prosesor Intel Core i5 generasi ke-10. Ia juga dibekali dengan RAM 4GB DDR4 dan SSD berkemampuan NVMe 256GB. Ada juga slot HDD kosong untuk disematkan hardisk SATA.\n" +
                    "\n" +
                    "ASUS menyediakan sensor fingerprint scanner dan teknologi ICEpower dan SonicMaster yang akan membuat kualitas suara makin jernih.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 15.6-inch LED Backlit FHD (1920 x 1080) 16:9 aspect ratio 250nits Anti-glare display 45% NTSC color gamut\n" +
                    "Processor: Intel® Core™ i5-1035G1 Processor 1.0 GHz (6M Cache, up to 3.6 GHz, 4 cores)\n" +
                    "Graphic Card: Intergrated GPU Intel® UHD Graphics\n" +
                    "RAM: 4 GB DDR4 on board\n" +
                    "Storage: 256GB M.2 NVMe™ PCIe® 3.0 SSD + housing HDD untuk penambahan storage\n" +
                    "Harga : Rp 9jutaan"
        ),
        Product(
            "ASUS VivoBook Pro K3400P",
            R.drawable.laptop_delapan,
            15,
            15000000,
            "ASUS VivoBook Pro K3400P merupakan laptop yang diperuntukkan untuk gamer sejati karena menggunakan prosesor Intel series berperforma tinggi.\n" +
                    "\n" +
                    "Apalagi, disematkannya GPU diskrit berupa NVIDIA® GeForce® GTX 1650 4GB GDDR6 yang mendukung game AAA populer dengan frame rate kencang seperti Elden Ring.\n" +
                    "\n" +
                    "Ia hadir dengan RAM 8GB DDR4 on board dan penyimpanan 512GB M.2 NVMe™ PCIe® 3.0 SSD. Dalam hal layar, perangkat menggunakan layar OLED dan sudah mendukung resolusi 2.8K serta lebih tajam dibanding layar Full HD 1080p.\n" +
                    "\n" +
                    "Fitur lainnya yakni WiFi 6, Thunderbolt 4, sensor pemindai sidik jari, hingga webcam yang dilengkapi privacy shutter.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 14.0-inch Backlit OLED 2.8K (2880 x 1800) OLED 16:10 aspect ratio Glossy display 100% DCI-P3 color gamut PANTONE Validated\n" +
                    "Processor: Intel® Core™ i5-11300H / Intel® Core™ i7-11370H\n" +
                    "Graphic Card: Intel® Iris Xe Graphics + NVIDIA® GeForce® GTX 1650\n" +
                    "RAM: 8GB DDR4 on board\n" +
                    "Storage: 512GB M.2 NVMe™ PCIe® 3.0 SSD\n" +
                    "Harga : mulai Rp 14 – Rp 16jutaan"
        ),
        Product(
            "ASUS TUF Gaming A15",
            R.drawable.laptop_sembilan,
            35,
            20000000,
            "ASUS TUF Gaming A15 merupakan salah satu laptop gaming besutan ASUS yang paling bergengsi di 2021. Ia tidak hanya menghadirkan performa terbaik tapi juga bodi yang kokoh dengan sertifikasi militer MIL-STD-810H.\n" +
                    "\n" +
                    "Perangkat menggunakan prosesor AMD Ryzen™ 7 5800H Processor 3.2 GHz, RAM 8GB dan penyimpanan 512GB . Ada juga fitur Advaced Two-Way AI Noise Cancelling untuk mengurangi noise pada suara mikrofon saat melakukan sesi gaming bersama teman.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 15.6-inch, FHD (1920 x 1080) 16:9, anti-glare display, sRGB:62.5%, Adobe:47.34%, Refresh Rate:144Hz, Value IPS-level, Optimus\n" +
                    "Processor: AMD Ryzen™ 7 5800H Processor 3.2 GHz (16M Cache, up to 4.4 GHz)\n" +
                    "Graphic Card: NVIDIA ® GeForce RTX™ 3060 Laptop GPU, , Up to 1630MHz at 90W (95W with Dynamic Boost), 6GB GDDR6\n" +
                    "RAM: 8GB , Max Capacity : 32GB\n" +
                    "Storage: 512GB M.2 NVMe™ PCIe® 3.0 SSD\n" +
                    "Harga : Rp 20jutaan"
        ),
        Product(
            "ASUS ZenBook Flip 13 UX363EA-OLED551",
            R.drawable.laptop_sepuluh,
            42,
            17000000,
            "ASUS ZenBook Flip 13 UX363EA-OLED551 merupakan pilihan terbaik bagi para desainer karena konvartibel yang bisa dijadikan sebagai tablet.\n" +
                    "\n" +
                    "Dengan layar touchscreen, pengguna bisa bebas melukis dan menggamar dengan stylus yang tersedia dalam box. Layarnya juga sudah tersertifikasi PANTONE Validated yang akan memudahkan pengguna berkolaborasi dengan desainer lain atau klien dalam hal warna.\n" +
                    "\n" +
                    "Dalam hal performa, laptop ditenagai Intel® Core™ i5-1135G7 Processor 2.4 GHz dipadu RAM 8GB dan penyimpanan 512GB SSD.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 13.3-inch Touch screen OLED FHD (1920 x 1080) 16:9 Glossy display 100% DCI-P3 color gamut PANTONE Validated\n" +
                    "Processor: Intel® Core™ i5-1135G7 Processor 2.4 GHz (8M Cache, up to 4.2 GHz, 4 cores)\n" +
                    "Graphic Card: Intel® Iris Xe Graphics\n" +
                    "RAM: 8GB LPDDR4X on board\n" +
                    "Storage: 512GB M.2 NVMe™ PCIe® 3.0 SSD\n" +
                    "Harga : Rp 17jutaan"
        ),
        Product(
            "ASUS VivoBook Ultra 15 M513UA",
            R.drawable.laptop_sebelas,
            50,
            10000000,
            "Asus VivoBook Ultra 15 M513UA yang ditenagai AMD Ryzen 5000 series akan meningkatkan kapabilitas komputasi.\n" +
                    "\n" +
                    "Laptop juga dibekali dengan AMD Ryzen™ 5 5500U / AMD Ryzen™ 7 5700U, RAM 8GB dan penyimpanan hingga 512GB. Diijamin pengguna tidak lagi mengalami lag saat melakukan multitasking.\n" +
                    "\n" +
                    "Ia hadir dengan layar OLED NanoEdge 15 inci dengan resolusi Full HD yang menampilkan warna super akurat. meski pada tingkat kecerahan rendah.\n" +
                    "\n" +
                    "Kualitas speaker laptop ini juga didukung oleh teknologi standar Harman Kardon yang tak hanya membuat lagu terdengar menakjubkan.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 15.6-inch, FHD (1920 x 1080) 16:9 aspect ratio\n" +
                    "Processor: AMD Ryzen™ 5 5500U / AMD Ryzen™ 7 5700U\n" +
                    "Graphic Card: AMD Radeon™ Graphics\n" +
                    "RAM: 8GB DDR3 on board, Memory Max Up to:16GB\n" +
                    "Storage: 512GB M.2 NVMe™ PCIe® 3.0 SSD\n" +
                    "Harga : Rp 10jutaan"
        ),
        Product(
            "ASUS VivoBook Ultra 15 OLED K513EA",
            R.drawable.laptop_dua_belas,
            10,
            8000000,
            "ASUS membuat gebrakan saat harga laptop makin tinggi. ASUS VivoBook Ultra 15 OLED K513EA dirilis dengan panel OLED seharga Rp 8jutaan saja. biasanya layar OLED baru dibanderol dengan harga Rp 10jutaan ke atas.\n" +
                    "\n" +
                    "Perangkat menggunakan prosesor Core i3 generasi 11 (Tiger Lake-H) yang nyaman dipakai untuk editing foto atau video, dan menonton film\n" +
                    "\n" +
                    "RAM bawaan laptop hanya 4GB dengan SSD M2 256GB. Tetapi, kamu bisa menambah kapasitas penyimpanan dengan HDD atau SSD SATA. Ada juga varian Intel i5 yang dibanderol seharga Rp 11jutaan.\n" +
                    "\n" +
                    "Spesifikasi :\n" +
                    "\n" +
                    "Layar: 15.6 inci, OLED, FHD (1920 x 1080)16:9, Glossy display, 400 nit, DCI-P3 100% ,Screen-to-body ratio: 85％\n" +
                    "Processor: Intel® Core™ i5-1135G7 Processor 0.9-2.4 GHz (8M Cache, up to 4.2 GHz)\n" +
                    "Graphic Card: Intel Iris Xe\n" +
                    "RAM: 4GB DDR4 on board + 4GB DDR4 SO-DIMM,Memory Max Up to 8GB\n" +
                    "Storage: 256GB M.2 NVMe™ PCIe® 3.0 SSD, HDD slot\n" +
                    "Harga : Rp 8jutaan\n"
        )
    )

    val product: MutableLiveData<List<Product>> = MutableLiveData()

    fun getProduct(){
        product.value = list
    }
}