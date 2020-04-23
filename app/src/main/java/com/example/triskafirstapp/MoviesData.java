package com.example.triskafirstapp;

import java.util.ArrayList;

public class MoviesData {
    private static String[] movieNames = {
            "Aladdin",
            "Artemis",
            "Avengers",
            "Captain Marvel",
            "Dumbo",
            "Frozen",
            "Lion King",
            "Penguins",
            "Star Wars",
            "Toy Story 4"
    };

    private static String[] movieDetails = {
            "Film animasi klasik yang pertama kali rilis pada tahun 1992 ini akan dibuat versi live actionnya oleh Disney. Animasi klasik ini mengisahkan tentang seorang pemuda miskin yang mendapatkan sebuah lampu ajaib berisi jin.",
            "Artemis Fowl adalah Young Adult Fantasy yang ditulis oleh Eoin Colfer. Film ini bercerita tentang seorang penjahat cerdas yang berusaha mengumpulkan uang dari berbagai tindakan kriminal.",
            "Avengers : End Game merupakan sekuel keempat dari film Avengers. Film ini menceritakan kelanjutan dari Avengers : Infinity War, di mana Thanos telah berhasil melenyapkan setengah dari populasi di alam semesta.",
            "Captain Marvel akan ditayangkan dua bulan sebelum Avengers 4. Carol Danvers (Brie Larson) pemeran Captain Marvel sendiri ditampilkan dengan kostum lengkap dengan kekuatan super.",
            "Mengisahkan seekor anak gajah yatim piatu yang diasuh oleh bintang pemain sirkus dan dua anaknya. Film ini merupakan film terbaru yang diarahkan oleh Tim Burton, seorang sutradara yang piawai dalam melahirkan film-film fantasi terkenal.",
            "Film sekuel dari Frozen ini akan mengulangi kejayaannya dengan Frozen 2. Seperti apa Elsa, Anna, dan Olaf selama enam tahun ini?",
            "Selain Aladdin, film klasik Disney yang akan dijadikan live action adalah The Lion King, film ini akan menggunakan CGI untuk membuat seluruh binatang di dalamnya terlihat seperti asli. ",
            "Untuk menghormati Hari Bumi, Disneynature akan merilis film Penguins. Mengisahkan Steve, seekor penguin Adele, yang dalam sebuah pencarian untuk menemukan pasangan hidup dan memulai sebuah keluarga. Saat Steve bertemu dengan Wuzzo, sang kaisar, mereka jadi berteman.",
            "Sama seperti film-film Star Wars sebelumnya, penggemar dapat mengharapkan final yang mendebarkan untuk trilogy ketiga ini.",
            "Sekuel dari Toy Story 4 ini akan rilis pada 21 Juni 2019 mendatang. Film yang diproduksi oleh rumah produksi Pixar Animation Studios ini disutradarai oleh John Lasseter."
    };

    private static int[] moviesImages = {
            R.drawable.aladdin,
            R.drawable.artemis,
            R.drawable.avengers,
            R.drawable.captainmarvel,
            R.drawable.dumbo,
            R.drawable.frozen,
            R.drawable.lionking,
            R.drawable.penguins,
            R.drawable.starwars,
            R.drawable.toystory4
    };

    static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();
        for (int position = 0; position < movieNames.length; position++) {
            Movie movie = new Movie();
            movie.setName(movieNames[position]);
            movie.setDetail(movieDetails[position]);
            movie.setPhoto(moviesImages[position]);
            list.add(movie);
        }
        return list;
    }
}

