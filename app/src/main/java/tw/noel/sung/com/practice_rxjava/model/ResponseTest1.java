package tw.noel.sung.com.practice_rxjava.model;

import java.util.List;

public class ResponseTest1 {

    /**
     * startPage : 97
     * tabNewsItem : [{"id":97,"name":"即時","sort":1,"isVisible":true},{"id":98,"name":"熱門","sort":2,"isVisible":true},{"id":6,"name":"政治","sort":3,"isVisible":true},{"id":8,"name":"娛樂","sort":4,"isVisible":true},{"id":4,"name":"生活","sort":5,"isVisible":true},{"id":41,"name":"社會","sort":6,"isVisible":true},{"id":5,"name":"國際","sort":7,"isVisible":true},{"id":9,"name":"名家","sort":8,"isVisible":true},{"id":12,"name":"汽車","sort":9,"isVisible":true},{"id":50,"name":"旅遊","sort":10,"isVisible":true},{"id":47,"name":"寵物","sort":11,"isVisible":true},{"id":34,"name":"運動","sort":12,"isVisible":true},{"id":7,"name":"科技","sort":13,"isVisible":true},{"id":2,"name":"財經","sort":14,"isVisible":true},{"id":42,"name":"新奇","sort":15,"isVisible":true}]
     * videoLives : [{"caption":"【CH54三立新聞】線上直播","youtube":"https://live.setn.com/Live/358","youtubeURN":"https://live.setn.com/Live/358","openMode":1,"headerLive":true,"newsID":0,"imageFile":"https://attach.setn.com/newsimages/"},{"caption":"【三立iNEWS】線上直播","youtube":"https://live.setn.com/Live/691","youtubeURN":"https://live.setn.com/Live/691","openMode":1,"headerLive":true,"newsID":0,"imageFile":"https://attach.setn.com/newsimages/"},{"caption":"下載APP 看影片答題抽好禮","youtube":"https://acts.setn.com/event/setnapp2019/index.html","youtubeURN":"https://acts.setn.com/event/setnapp2019/index.html","openMode":1,"headerLive":false,"newsID":0,"imageFile":"https://attach.setn.com/newsimages/"},{"caption":"【女孩要幹嘛】即時影音","youtube":"https://watch.setn.com/","youtubeURN":"https://watch.setn.com/","openMode":1,"headerLive":false,"newsID":0,"imageFile":"https://attach.setn.com/newsimages/"},{"caption":"福袋玩真的　3仟塊抽中60萬驕車","youtube":"https://www.setn.com/News.aspx?NewsID=565164","youtubeURN":"https://www.setn.com/News.aspx?NewsID=565164","openMode":2,"headerLive":false,"newsID":565164,"imageFile":"2019/07/04/"},{"caption":"夏季旅遊把握4大模式　成功抗日！","youtube":"https://www.setn.com/News.aspx?NewsID=565145","youtubeURN":"https://www.setn.com/News.aspx?NewsID=565145","openMode":2,"headerLive":false,"newsID":565145,"imageFile":"2019/07/04/"},{"caption":"蝶型建築！ 270度採光絕版景觀曝","youtube":"https://www.setn.com/News.aspx?NewsID=565329","youtubeURN":"https://www.setn.com/News.aspx?NewsID=565329","openMode":2,"headerLive":false,"newsID":565329,"imageFile":"2019/07/05/"},{"caption":"桃園市中心絕版位置！中山都滙將完銷","youtube":"https://www.setn.com/News.aspx?NewsID=563800","youtubeURN":"https://www.setn.com/News.aspx?NewsID=563800","openMode":2,"headerLive":false,"newsID":563800,"imageFile":"2019/07/02/"},{"caption":"正對高醫！這建案未公開先轟動！","youtube":"https://www.setn.com/News.aspx?NewsID=563398","youtubeURN":"https://www.setn.com/News.aspx?NewsID=563398","openMode":2,"headerLive":false,"newsID":563398,"imageFile":"2019/07/01/"},{"caption":"天天作這事　他吃喝玩樂不用錢","youtube":"https://www.setn.com/News.aspx?NewsID=553390","youtubeURN":"https://www.setn.com/News.aspx?NewsID=553390","openMode":2,"headerLive":false,"newsID":553390,"imageFile":"2019/06/10/"},{"caption":"日本超乾淨？網笑台人隨便　他揭關鍵","youtube":"https://www.setn.com/News.aspx?NewsID=566230","youtubeURN":"https://www.setn.com/News.aspx?NewsID=566230","openMode":2,"headerLive":false,"newsID":566230,"imageFile":"2017/11/28/"},{"caption":"7旬翁跑全馬遭疑作弊　竟\u2026浮屍河面","youtube":"https://www.setn.com/News.aspx?NewsID=566228","youtubeURN":"https://www.setn.com/News.aspx?NewsID=566228","openMode":2,"headerLive":false,"newsID":566228,"imageFile":"2019/07/06/"},{"caption":"勝文：85大樓新業主說「被韓感動」","youtube":"https://www.setn.com/News.aspx?NewsID=566218","youtubeURN":"https://www.setn.com/News.aspx?NewsID=566218","openMode":2,"headerLive":false,"newsID":566218,"imageFile":"2019/01/18/"},{"caption":"生完小孩反更辣！網揭絕美地方媽雪乳","youtube":"https://www.setn.com/News.aspx?NewsID=566225","youtubeURN":"https://www.setn.com/News.aspx?NewsID=566225","openMode":2,"headerLive":false,"newsID":566225,"imageFile":"2019/07/06/"}]
     */

    private int startPage;
    private List<TabNewsItemBean> tabNewsItem;
    private List<VideoLivesBean> videoLives;

    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    public List<TabNewsItemBean> getTabNewsItem() {
        return tabNewsItem;
    }

    public void setTabNewsItem(List<TabNewsItemBean> tabNewsItem) {
        this.tabNewsItem = tabNewsItem;
    }

    public List<VideoLivesBean> getVideoLives() {
        return videoLives;
    }

    public void setVideoLives(List<VideoLivesBean> videoLives) {
        this.videoLives = videoLives;
    }

    public static class TabNewsItemBean {
        /**
         * id : 97
         * name : 即時
         * sort : 1
         * isVisible : true
         */

        private int id;
        private String name;
        private int sort;
        private boolean isVisible;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }

        public boolean isIsVisible() {
            return isVisible;
        }

        public void setIsVisible(boolean isVisible) {
            this.isVisible = isVisible;
        }
    }

    public static class VideoLivesBean {
        /**
         * caption : 【CH54三立新聞】線上直播
         * youtube : https://live.setn.com/Live/358
         * youtubeURN : https://live.setn.com/Live/358
         * openMode : 1
         * headerLive : true
         * newsID : 0
         * imageFile : https://attach.setn.com/newsimages/
         */

        private String caption;
        private String youtube;
        private String youtubeURN;
        private int openMode;
        private boolean headerLive;
        private int newsID;
        private String imageFile;

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getYoutube() {
            return youtube;
        }

        public void setYoutube(String youtube) {
            this.youtube = youtube;
        }

        public String getYoutubeURN() {
            return youtubeURN;
        }

        public void setYoutubeURN(String youtubeURN) {
            this.youtubeURN = youtubeURN;
        }

        public int getOpenMode() {
            return openMode;
        }

        public void setOpenMode(int openMode) {
            this.openMode = openMode;
        }

        public boolean isHeaderLive() {
            return headerLive;
        }

        public void setHeaderLive(boolean headerLive) {
            this.headerLive = headerLive;
        }

        public int getNewsID() {
            return newsID;
        }

        public void setNewsID(int newsID) {
            this.newsID = newsID;
        }

        public String getImageFile() {
            return imageFile;
        }

        public void setImageFile(String imageFile) {
            this.imageFile = imageFile;
        }
    }
}
