package com.yb7001.web.myproject.bean;


import java.util.List;

public class LoadUserMessages {
    private String status;
    private String tip;
    private result result;

    public LoadUserMessages.result getResult() {
        return result;
    }

    public void setResult(LoadUserMessages.result result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public static class result{
        private int total;
        private List<Listj>list;

        public List<Listj> getList() {
            return list;
        }

        public void setList(List<Listj> list) {
            this.list = list;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    public class Listj{
        private String rowId;
        private String id;
        private String user_id;
        private String message_type;
        private String message_title;
        private String message_content;
        private String date_time;

        public String getDate_time() {
            return date_time;
        }

        public void setDate_time(String date_time) {
            this.date_time = date_time;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getMessage_content() {
            return message_content;
        }

        public void setMessage_content(String message_content) {
            this.message_content = message_content;
        }

        public String getMessage_title() {
            return message_title;
        }

        public void setMessage_title(String message_title) {
            this.message_title = message_title;
        }

        public String getMessage_type() {
            return message_type;
        }

        public void setMessage_type(String message_type) {
            this.message_type = message_type;
        }

        public String getRowId() {
            return rowId;
        }

        public void setRowId(String rowId) {
            this.rowId = rowId;
        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String user_id) {
            this.user_id = user_id;
        }
    }

}
