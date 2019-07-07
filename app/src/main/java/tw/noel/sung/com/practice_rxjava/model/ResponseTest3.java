package tw.noel.sung.com.practice_rxjava.model;

import java.util.List;

public class ResponseTest3 {

    private List<LivesBean> lives;
    private List<VodsBean> vods;
    private List<VideoLivesBean> videoLives;

    public List<LivesBean> getLives() {
        return lives;
    }

    public void setLives(List<LivesBean> lives) {
        this.lives = lives;
    }

    public List<VodsBean> getVods() {
        return vods;
    }

    public void setVods(List<VodsBean> vods) {
        this.vods = vods;
    }

    public List<VideoLivesBean> getVideoLives() {
        return videoLives;
    }

    public void setVideoLives(List<VideoLivesBean> videoLives) {
        this.videoLives = videoLives;
    }

    public static class LivesBean {
        /**
         * slvid : 358
         * captionText : CH54三立新聞直播
         * videoText : CH54三立新聞台直播，《三立新聞網》24小時不間斷，讓您即時掌握最新新聞動態！
         * imageUrl : https://attach.setn.com/images/1221_358_640x360.jpg
         * isvod : false
         * liveType : 2
         * player : 1
         * vodVideoURL : https://www.youtube.com/embed/4ZVUmEUFwaY
         * url : https://www.setn.com/m/NewsLive.aspx?SLVID=358
         * startTime : 2018/07/04 12:00
         * webUrl : null
         */

        private int slvid;
        private String captionText;
        private String videoText;
        private String imageUrl;
        private boolean isvod;
        private int liveType;
        private int player;
        private String vodVideoURL;
        private String url;
        private String startTime;
        private Object webUrl;

        public int getSlvid() {
            return slvid;
        }

        public void setSlvid(int slvid) {
            this.slvid = slvid;
        }

        public String getCaptionText() {
            return captionText;
        }

        public void setCaptionText(String captionText) {
            this.captionText = captionText;
        }

        public String getVideoText() {
            return videoText;
        }

        public void setVideoText(String videoText) {
            this.videoText = videoText;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public boolean isIsvod() {
            return isvod;
        }

        public void setIsvod(boolean isvod) {
            this.isvod = isvod;
        }

        public int getLiveType() {
            return liveType;
        }

        public void setLiveType(int liveType) {
            this.liveType = liveType;
        }

        public int getPlayer() {
            return player;
        }

        public void setPlayer(int player) {
            this.player = player;
        }

        public String getVodVideoURL() {
            return vodVideoURL;
        }

        public void setVodVideoURL(String vodVideoURL) {
            this.vodVideoURL = vodVideoURL;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public Object getWebUrl() {
            return webUrl;
        }

        public void setWebUrl(Object webUrl) {
            this.webUrl = webUrl;
        }
    }

    public static class VodsBean {
        /**
         * slvid : 1826
         * captionText : 2019臺南夏日音樂節-將軍吼
         * videoText : 「2019臺南夏日音樂節─將軍吼」7月20日在將軍漁港登場！今年邀請了亞洲搖滾樂團八三夭、金曲浪子茄子蛋、唱跳小天王鼓鼓 呂思緯、創作情歌王子蕭秉治 廷廷、漂亮寶貝Kimberley陳芳語、聲林之王冠軍新秀李友廷，以及百大電音女王DJ RayRay等華語流行樂壇重量級卡司，將於晚間6點熱情開唱！感受臺南西濱獨特的夏日音樂盛會！
         * imageUrl : https://attach.setn.com/images/190720_1826_640x360.jpg
         * isvod : true
         * liveType : 1
         * player : 1
         * vodVideoURL : https://www.youtube.com/embed/s8afeT__qC4
         * url : https://www.setn.com/m/StarLive.aspx?SLVID=1826
         * startTime : 2019/07/20 18:00
         * webUrl : null
         */

        private int slvid;
        private String captionText;
        private String videoText;
        private String imageUrl;
        private boolean isvod;
        private int liveType;
        private int player;
        private String vodVideoURL;
        private String url;
        private String startTime;
        private Object webUrl;

        public int getSlvid() {
            return slvid;
        }

        public void setSlvid(int slvid) {
            this.slvid = slvid;
        }

        public String getCaptionText() {
            return captionText;
        }

        public void setCaptionText(String captionText) {
            this.captionText = captionText;
        }

        public String getVideoText() {
            return videoText;
        }

        public void setVideoText(String videoText) {
            this.videoText = videoText;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public boolean isIsvod() {
            return isvod;
        }

        public void setIsvod(boolean isvod) {
            this.isvod = isvod;
        }

        public int getLiveType() {
            return liveType;
        }

        public void setLiveType(int liveType) {
            this.liveType = liveType;
        }

        public int getPlayer() {
            return player;
        }

        public void setPlayer(int player) {
            this.player = player;
        }

        public String getVodVideoURL() {
            return vodVideoURL;
        }

        public void setVodVideoURL(String vodVideoURL) {
            this.vodVideoURL = vodVideoURL;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public Object getWebUrl() {
            return webUrl;
        }

        public void setWebUrl(Object webUrl) {
            this.webUrl = webUrl;
        }
    }

    public static class VideoLivesBean {
        /**
         * caption : 關注天之蕉子 即時星聞不漏接
         * youtube : https://www.setn.com/project.aspx?ProjectID=6273
         * youtubeURN : https://www.setn.com/project.aspx?ProjectID=6273
         * openMode : 1
         * headerLive : false
         * newsID : 0
         * imageFile : null
         */

        private String caption;
        private String youtube;
        private String youtubeURN;
        private int openMode;
        private boolean headerLive;
        private int newsID;
        private Object imageFile;

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

        public Object getImageFile() {
            return imageFile;
        }

        public void setImageFile(Object imageFile) {
            this.imageFile = imageFile;
        }
    }
}
