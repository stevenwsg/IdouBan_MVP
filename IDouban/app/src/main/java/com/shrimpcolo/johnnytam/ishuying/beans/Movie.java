package com.shrimpcolo.johnnytam.ishuying.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Johnny Tam on 2017/4/26.
 */

public class Movie implements Serializable {

    /**
     * rating : {"max":10,"average":7.2,"stars":"40","min":0}
     * genres : ["动作","犯罪"]
     * title : 速度与激情8
     * casts : [{"alt":"https://movie.douban.com/celebrity/1041020/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/53186.jpg","large":"https://img3.doubanio.com/img/celebrity/large/53186.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/53186.jpg"},"name":"范·迪塞尔","id":"1041020"},{"alt":"https://movie.douban.com/celebrity/1044707/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/196.jpg","large":"https://img3.doubanio.com/img/celebrity/large/196.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/196.jpg"},"name":"道恩·强森","id":"1044707"},{"alt":"https://movie.douban.com/celebrity/1018991/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/44470.jpg","large":"https://img3.doubanio.com/img/celebrity/large/44470.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/44470.jpg"},"name":"查理兹·塞隆","id":"1018991"}]
     * collect_count : 112298
     * original_title : The Fate of the Furious
     * subtype : movie
     * directors : [{"alt":"https://movie.douban.com/celebrity/1009396/","avatars":{"small":"https://img3.doubanio.com/img/celebrity/small/4451.jpg","large":"https://img3.doubanio.com/img/celebrity/large/4451.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/4451.jpg"},"name":"F·加里·格雷","id":"1009396"}]
     * year : 2017
     * images : {"small":"https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2444256500.webp","large":"https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2444256500.webp","medium":"https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2444256500.webp"}
     * alt : https://movie.douban.com/subject/26260853/
     * id : 26260853
     */

    private RatingBean rating;
    private String title;
    private int collect_count;
    private String original_title;
    private String subtype;
    private String year;
    private ImagesBean images;
    private String alt;
    private String id;
    private List<String> genres;
    private List<CastsBean> casts;
    private List<DirectorsBean> directors;

    public RatingBean getRating() {
        return rating;
    }

    public void setRating(RatingBean rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCollect_count() {
        return collect_count;
    }

    public void setCollect_count(int collect_count) {
        this.collect_count = collect_count;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public ImagesBean getImages() {
        return images;
    }

    public void setImages(ImagesBean images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public List<CastsBean> getCasts() {
        return casts;
    }

    public void setCasts(List<CastsBean> casts) {
        this.casts = casts;
    }

    public List<DirectorsBean> getDirectors() {
        return directors;
    }

    public void setDirectors(List<DirectorsBean> directors) {
        this.directors = directors;
    }

    public static class RatingBean implements Serializable {
        /**
         * max : 10
         * average : 7.2
         * stars : 40
         * min : 0
         */

        private int max;
        private double average;
        private String stars;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public double getAverage() {
            return average;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class ImagesBean implements Serializable {
        /**
         * small : https://img3.doubanio.com/view/movie_poster_cover/ipst/public/p2444256500.webp
         * large : https://img3.doubanio.com/view/movie_poster_cover/lpst/public/p2444256500.webp
         * medium : https://img3.doubanio.com/view/movie_poster_cover/spst/public/p2444256500.webp
         */

        private String small;
        private String large;
        private String medium;

        public String getSmall() {
            return small;
        }

        public void setSmall(String small) {
            this.small = small;
        }

        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }
    }

    public static class CastsBean implements Serializable {
        /**
         * alt : https://movie.douban.com/celebrity/1041020/
         * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/53186.jpg","large":"https://img3.doubanio.com/img/celebrity/large/53186.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/53186.jpg"}
         * name : 范·迪塞尔
         * id : 1041020
         */

        private String alt;
        private AvatarsBean avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBean getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBean avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBean implements Serializable {
            /**
             * small : https://img3.doubanio.com/img/celebrity/small/53186.jpg
             * large : https://img3.doubanio.com/img/celebrity/large/53186.jpg
             * medium : https://img3.doubanio.com/img/celebrity/medium/53186.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }

    public static class DirectorsBean implements Serializable {
        /**
         * alt : https://movie.douban.com/celebrity/1009396/
         * avatars : {"small":"https://img3.doubanio.com/img/celebrity/small/4451.jpg","large":"https://img3.doubanio.com/img/celebrity/large/4451.jpg","medium":"https://img3.doubanio.com/img/celebrity/medium/4451.jpg"}
         * name : F·加里·格雷
         * id : 1009396
         */

        private String alt;
        private AvatarsBeanX avatars;
        private String name;
        private String id;

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public AvatarsBeanX getAvatars() {
            return avatars;
        }

        public void setAvatars(AvatarsBeanX avatars) {
            this.avatars = avatars;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public static class AvatarsBeanX implements Serializable {
            /**
             * small : https://img3.doubanio.com/img/celebrity/small/4451.jpg
             * large : https://img3.doubanio.com/img/celebrity/large/4451.jpg
             * medium : https://img3.doubanio.com/img/celebrity/medium/4451.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }
    }
}
