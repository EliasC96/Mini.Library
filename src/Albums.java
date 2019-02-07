public class Albums extends Books {
        /**
         * The Albums subClass adds one more field
         */
        private String PageQuality ;
        /**
         * The Albums subClass ads one more method
         */
        public String getPageQuality () {return PageQuality;}

        public void setPageQuality(String pageQuality) { PageQuality = pageQuality; }

        @Override
        public String toString() {
                return "Albums{" +
                        "PageQuality='" + PageQuality + '\'' +
                        '}';
        }
}
