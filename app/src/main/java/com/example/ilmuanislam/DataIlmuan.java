package com.example.ilmuanislam;

import java.util.ArrayList;

public class DataIlmuan {

    private static String[] namaIlmuan = {
            "Ibnu Sina",
            "Al-Zahrawi",
            "Al-Khawarizmi",
            "Abbas ibn Firnas",
            "Ibnu Al Haytham",
            "Ahmad Ibn Tulun",
            "Al-Battani",
            "Ibnu Khaldun",
            "Al-Jazari",

    };

    private static String[] detailIlmuan = {
            "Ilmuwan dari Islam pertama yang mampu membawa perubahan besar bagi dunia, yakni Ibnu Sina. Saking berjasanya beliau dijuluki sebagai “Father of Doctor”, kontribusinya di bidang kedokteran tak perlu diragukan lagi.",
            "Al Zahrawi atau kerap disebut sebagai dokter menguasai wilayah Eropa. Karya-karyanya menyangkut semua hal tentang praktik kedokteran.",
            "Al Khawarizmi adalah salah satu ilmuwan besar Islam yang membawa banyak perubahan di dunia Islam. Karyanya banyak menginspirasi para ilmuwan dunia di bidang sains, khususnya fisika. Bahkan sejumlah ilmuwan Yunani belajar darinya.",
            "Abbas ibn Firnas adalah ilmuwan dari Andalusia yang banyak bergerak di bidang aerodinamika. Beliaulah muslim yang jadi penerbang pertama di dunia. Idenya ini terinspirasi dari permainan acrobat.",
            "Ibnu Al Haytham berasal dari Basrah, Irak. Walaupun awalnya ia adalah pegawai pemerintahan namun akhirnya Ibnu Al Haytham menyadari jika bakatnya adalah menjadi ilmuwan baik fisika maupun filsafat.",
            "Ilmuwan Islam yang berkontribusi di dunia kesehatan ternyata masih banyak, salah satunya adalah Ahmad Ibn Tulun. Berkatnya dunia medis saat ini berkembang pesat, banyak pengobatan mutakhir dan hebat bisa membuat orang sembuh bahkan dari penyakit langka dan keras.",
            "Al Battani adalah seorang ahli astronomi dan matematikawan dari Arab. Beliau lahir di Harran dekat Urfa. Sama halnya dengan Al- Khawarizmi, beliau telah membuat dunia mengakui keberadaan Islam saat itu.",
            "Beliau bahkan disebut sebagai bapak sosiologi, perintis ilmu Ekonomi, teori politik, dasar Filsafat Sejarah, dan masih banyak lagi sebutan lainnya.",
            "Al- Jazari merupakan penemu konsep dasar robot yang saat ini sudah bisa Anda lihat di berbagai belahan dunia.",

    };



    private static String[] hargaIlmuan = {
            "980 - 1037",
            "936 - 1013",
            "780 - 850",
            "810 - 887",
            "965 - 1039",
            "835 - 884",
            "850 - 923",
            "1332 - 1406",
            "1136 - 1206",

    };


    private static String[] karyaIlmuan = {
            "Penemu Manfaat Etanol dan Penemu Teori Penularan TBC ",
            "Penemu Teori Menjahit",
            "Penemu Teori Al Jabar, Trigonometri dan Astronomi, Penemu Algoritma, Angka 0",
            "Pencipta Ide Pesawat dan Dikenal Ilmuwan Serba Bisa",
            "Penulis Kitab Al- Manazir",
            "Pendiri Rumah Sakit Al Fustat",
            "Penemuan Penentuan Tahun dan Memecahkan Berbagai Persoalan Matematika",
            "Penulis Kitab Al-Ibar dan Muqaddimah",
            "Penemu Mesin Pompa Air dan Mesin Engkol dan Roda Gigi",

    };

    private static int[] gambarIlmuan = {
            R.drawable.ibnu_sina,
            R.drawable.al_zahrawi,
            R.drawable.al_khawarizmi,
            R.drawable.abbas_ibn_firnas,
            R.drawable.al_haytham,
            R.drawable.ahmad_ibn_tulun,
            R.drawable.al_battani,
            R.drawable.ibnu_khaldun,
            R.drawable.al_jazari,

    };

    static ArrayList<Ilmuan> getListData() {
        ArrayList<Ilmuan> list = new ArrayList<>();
        for (int position = 0; position < namaIlmuan.length; position++) {
            Ilmuan ilmuan = new Ilmuan();
            ilmuan.setNama_ilmuan(namaIlmuan[position]);
            ilmuan.setDetail_ilmuan(detailIlmuan[position]);
            ilmuan.setPhoto(gambarIlmuan[position]);
            ilmuan.setKarya(karyaIlmuan[position]);
            ilmuan.setHarga(hargaIlmuan[position]);
            list.add(ilmuan);
        }
        return list;
    }

}
