package com.kdblue.glideapp.Model;

/**
 * Created by kulde on 7/20/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class Details {

        @SerializedName("quote")
        @Expose
        private String quote;
        @SerializedName("author")
        @Expose
        private String author;
        @SerializedName("category")
        @Expose
        private String category;

        public Details(String quote, String author, String category) {
            this.quote = quote;
            this.author = author;
            this.category = category;
        }

        public String getQuote() {
            return quote;
        }

        public void setQuote(String quote) {
            this.quote = quote;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

    }

