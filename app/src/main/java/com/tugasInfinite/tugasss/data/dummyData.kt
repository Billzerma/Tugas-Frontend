package com.tugasInfinite.tugasss.data

import com.example.tugasss.R
import com.tugasInfinite.tugasss.model.Boss
import com.tugasInfinite.tugasss.model.Map
import com.tugasInfinite.tugasss.model.Weapon


object dummyData {
    val TheBoss = listOf(
        Boss(
            id = 1,
            name = "Morgot",
            title = "The Omen King",
            region = "Erdtree",
            photo = R.drawable.morgot
        ),
        Boss(
            id = 2,
            name = "Godrick the Grafted",
            title = "The Grafted",
            region = "Stromveil Castle",
            photo = R.drawable.godrick
        ),
        Boss(
            id = 3,
            name = "Renalla",
            title = "The Full Moon",
            region = "Academy Raya Lucaria",
            photo = R.drawable.renalla
        ),
        Boss(
            id = 4,
            name = "Radahn",
            title = "The Starscourge",
            region = "Caelid",
            photo = R.drawable.radahn
        ),
        Boss(
            id = 5,
            name = "Rykard",
            title = "The Blasphemy",
            region = "Mountain Gelmir",
            photo = R.drawable.rykard
        ),
        Boss(
            id = 6,
            name = "Mogh",
            title = "Lord of Blood",
            region = "Moghwyn Pallace",
            photo = R.drawable.mohg
        ),
        Boss(
            id = 7,
            name = "Malenia",
            title = "Blade of Miquella",
            region = "Elphael",
            photo = R.drawable.malenia
        ),
        Boss(
            id = 8,
            name = "Maliketh",
            title = "The Black Blade",
            region = "Crumbling Farum Azulla",
            photo = R.drawable.maliketh
        ),
        Boss(
            id = 9,
            name = "Hoarah Lux",
            title = "Warrior",
            region = "Erdtree",
            photo = R.drawable.hoara
        ),
        Boss(
            id = 10,
            name = "Dragon Lord Placidusax",
            title = "Ancient Dragon",
            region = "Crumbling Farum Azulla",
            photo = R.drawable.dragon
        )

    )

    val TheMaps= listOf(
        Map(
            id = 1,
            name = "Limgrave",
            desc = "Limgrave adalah Lokasi dan Wilayah dalam Elden Ring. Wilayah Limgrave adalah area pertama yang dapat diakses dalam permainan. Para pemain akan muncul dari salah satu tempat tinggal bawah tanah, dan disuguhi dengan lingkungan yang subur di Limgrave. Limgrave adalah bagian yang subur dan luas dari Tenebrae Demesne. Pohon-pohon emas dan rumput tinggi serta semak-semak menyediakan banyak makanan bagi satwa liar lokal, yang meliputi babi hutan, domba, kambing, dan hewan pengerat serta makhluk-makhluk terbang seperti elang dan burung hantu. Satwa liar yang lebih jahat dan agresif juga ada, dan mereka yang berani menjelajah harus siap untuk melawannya.",
            photo = R.drawable.limgrave
        ),
        Map(
            id = 2,
            name = "Caelid",
            desc = "Caelid adalah Lokasi dan Wilayah dalam Elden Ring. Wilayah Caelid terletak di sebelah timur Limgrave. Wilayah ini terutama ditandai oleh lingkungan yang merah, korup, dan sejumlah besar mayat hidup yang berkeliaran di padang terbuka.\n" +
                    "\n" +
                    "Caelid, dikenal sebagai tempat pertempuran terakhir antara Jenderal Radahn dan Malenia, Pedang Miquella, adalah tanah yang luas yang sempurna rusak oleh pembusukan merah menyala.",
            photo = R.drawable.caelid
        ),
        Map(
            id = 3,
            name = "Stromveil Castle",
            desc = "Stormveil Castle adalah Legacy Dungeon di Elden Ring. Sebuah kastil yang terletak di tebing Stormhill, sebuah benteng milik Godrick the Grafted. Waspada terhadap lokasi ini karena ada gerombolan tentara dan makhluk-makhluk yang bersikap tidak ramah yang akan menghentikan segala sesuatu dan siapa pun yang mencoba untuk menyusup ke area tersebut. Para pemain yang memasuki Stormveil Castle harus berhati-hati karena ini adalah sebuah dungeon yang menantang dengan kelompok musuh yang banyak dengan perangkap dan ballista serta mini-boss. Daerah ini tidak memperbolehkan untuk menunggang kuda.",
            photo = R.drawable.veil
        ),
        Map(
            id = 4,
            name = "Acamdemy Raya Lucaria",
            desc = "Akademi Raya Lucaria adalah Legacy Dungeon di Elden Ring. Area ini cukup berbeda karena memiliki berbagai nuansa biru, dibandingkan dengan ruang terbuka hijau Limgrave, yang ditutupi oleh kristal tidak hanya di lingkungannya tetapi juga pada makhluk yang mendiaminya. Ini bervariasi dari siput hingga hewan yang lebih ganas hingga krustasea di bawah air seperti kepiting dan sangat dijaga oleh para sarjana akademi.",
            photo = R.drawable.raya
        ),
        Map(
            id = 5,
            name = "Elphael",
            desc = "Elphael, Brace of the Haligtree adalah Legacy Dungeon di Elden Ring. Elphael, Brace of the Haligtree adalah sebuah kastil besar yang merupakan bagian kedua dari dungeon Haligtree milik Miquella. Akses ke kastil ini bisa diperoleh setelah mengalahkan Loretta, Knight of the Haligtree dengan turun menggunakan lift yang ditemukan segera setelahnya. Elphael adalah salah satu lokasi paling sulit dalam Elden Ring dan juga menampilkan bos terberat dalam permainan. Dirancang untuk pemain tingkat tinggi dan akhir permainan.",
            photo = R.drawable.elpahel
        ),
        Map(
            id = 6,
            name = "Leyndell City",
            desc = "Leyndell, Ibukota Kerajaan adalah Legacy Dungeon di Elden Ring. Sebuah kota ibu yang luas yang menampung berbagai musuh kuat, serta juara yang sebelumnya telah dihadapi. Ibukota Kerajaan Leyndell berfungsi sebagai pusat pemerintahan dan pusat administrasi Altus Plateau.",
            photo = R.drawable.lyndell
        ),
        Map(
            id = 7,
            name = "Mount Gelmir",
            desc = "Gunung Gelmir adalah sebuah wilayah gunung berapi di sebelah barat Dataran Tinggi Altus, diperintah oleh Volcano Manor yang misterius dan tuannya, Praetor Rykard. Wilayah ini telah dilanda bencana, dan merupakan rumah bagi banyak makhluk yang menjijikkan.\n" +
                    "\n" +
                    "Gunung Gelmir adalah Lokasi di Elden Ring. Gunung Gelmir adalah sebuah wilayah gunung berapi yang terletak di sebelah utara Liurnia dan barat Dataran Tinggi Altus. Gunung tersebut dapat diakses melalui:" +
                    "1.Mencapai Dataran Tinggi Altus melalui Entah melalui Ruin-Strewn Precipice atau Grand Lift of Dectus dan kemudian menuju ke utara melalui lembah menuju sebuah jembatan. Lihat ke kanan untuk menemukan Spiritspring yang akan membawa Anda ke atas tebing dan kemudian menyeberang ke barat untuk mencapai tempat pemberian karunia Bridge of Iniquity. Dari sini, teruslah ke barat sambil mendekati tebing sampai Anda melihat tangga tali untuk mencapai tempat pemberian karunia First Mt. Gelmir Campsite." +
                    "Melakukan questline Rya, kemudian mencapai Dataran Tinggi Altus dan bertemu dengannya di sana. Dia akan membawa Anda ke Volcano Manor, dari manor keluar dari pintu utama manor untuk mencapai Gunung Gelmir." +
                    "Diculik oleh Abductor Virgin di dasar Akademi Raya Lucaria seperti yang disarankan oleh Patches untuk melakukan perjalanan ke Volcano Manor, kemudian mengalahkan Abductor Virgins untuk membuka akses ke Gunung Gelmir dan Dataran Tinggi Altus. (meskipun memungkinkan untuk mencapai pintu masuk manor dengan cara ini tanpa mengalahkan Abductor Virgins, pintu utama manor yang menghubungkan ke Gunung Gelmir tertutup dan tidak dapat dibuka dari dalam - pintu ini biasanya terbuka jika Anda datang ke manor menggunakan dua cara lain di atas",
            photo = R.drawable.gelmir
        ),
        Map(
            id = 8,
            name = "Weeping Peninsulla",
            desc = "The Weeping Peninsula adalah ujung paling selatan dari Tanah-tanah Antara. Semenanjung ini mendapatkan namanya dari hujan yang tak pernah berhenti, memberikan kesan akan sebuah tanah yang selalu meratapi. Ini terhubung dengan Limgrave yang sebenarnya oleh Jembatan Pengorbanan di utara. Castle Morne berdiri di ujung paling selatan semenanjung.",
            photo = R.drawable.weeping
        ),
        Map(
            id = 9,
            name = "Ainsell River",
            desc = "Salah satu dari dua sungai besar yang mengalir di bawah Tanah-tanah Antara. Ainsel dikatakan menjadi kuburan peradaban yang berkembang sebelum Erdtree. Sisi timur Ainsel didominasi oleh reruntuhan Istana Uhl, yang ditandai oleh makam-makam dan patung-patungnya, dan dihuni oleh Claymen yang bertugas sebagai imam dinasti kuno.\n" +
                    "\n" +
                    "Nokstella, salah satu dari Kota Abadi, dapat ditemukan di bagian barat ruang bawah tanah, dihuni oleh Nox yang dibuang ke bawah tanah oleh Kehendak Agung pada masa lampau. Lebih dalam lagi adalah Danau Kepus, sebuah rawa bawah tanah yang busuk dengan reruntuhan kuno, di mana esensi Tuhan Luar pernah disegel. Pada titik terdalam adalah sarang Astel, sebuah bintang yang cacat yang pernah menyerang sebuah Kota Abadi dan mengambil langitnya. Di luar Astel ada lift yang mengarah ke Altar Cahaya Bulan, asalkan Cincin Bulan Gelap telah ditemukan.\n" +
                    "\n" +
                    "Ainsel dapat diakses melalui Sumur Sungai Ainsel di timur Liurnia dari Danau-danau. Sungai Utama Ainsel, yang meliputi Nokstella, dapat diakses melalui gerbang pengiriman di Renna's Rise, setelah Ranni sang Penyihir mendapatkan Fingerslayer Blade.",
            photo = R.drawable.ainsel
        ),
        Map(
            id = 10,
            name = "Nokron City",
            desc = "One of the Eternal Cities inhabited by the Nox, who were banished underground after invoking the ire of the Greater Will.[1] Nokron houses the Fingerslayer Blade, a blood-drenched fetish made from a corpse which can harm the Greater Will and its vassals, and is proof of the treason of the Nox.[2]\n" +
                    "\n" +
                    "Nokron is notably difficult to access, although a band of slaves-turned-soldiers managed to find their way there, becoming trapped in the subterranean realm after the discover of Ghostflame.[3] While the city is visible from the lower portion of Siofra River, the route to it is only opened after Starscourge Radahn is defeated, which causes a star to fall upon Limgrave, opening a deep crater near Fort Haight.",
            photo = R.drawable.nokron
        ),

        )

    val TheWeapon= listOf(
        Weapon(
            id = 1,
            name = "Limgrave",
            descWeapon = "The Omen King",
            photo = R.drawable.gransax
        ),
        Weapon(
            id = 2,
            name = "Limgrave",
            descWeapon = "The Omen King",
            photo = R.drawable.dragonblade
        ),

        Weapon(
            id = 3,
            name = "River of Blodd",
            descWeapon = "The Omen King",
            photo = R.drawable.river
        ),

        Weapon(
            id = 4,
            name = "Greatbow Lion",
            descWeapon = "The Omen King",
            photo = R.drawable.row
        ),

        Weapon(
            id = 5,
            name = "katana",
            descWeapon = "The Omen King",
            photo = R.drawable.river
        ),
        Weapon(
            id = 6,
            name = "Greatsword",
            descWeapon = "The Omen King",
            photo = R.drawable.great
        ),

        Weapon(
            id = 7,
            name = "Curse Blade Omen",
            descWeapon = "The Omen King",
            photo = R.drawable.cursedomen
        ),

        Weapon(
            id = 8,
            name = "Great Bow ",
            descWeapon = "The Omen King",
            photo = R.drawable.row
        ),

        Weapon(
            id = 9,
            name = "Greatsword",
            descWeapon = "The Omen King",
            photo = R.drawable.great
        ),

        Weapon(
            id = 10,
            name = "Curse Blade Omen",
            descWeapon = "The Omen King",
            photo = R.drawable.cursedomen
        ),



        )



}