package com.company;

public class Email {
    // required
    private String to;
    private String subject;
    //optional
    private String cc;
    private String body;
    private int priority;
    private boolean attachment;

    public boolean getAttachment(){
        return this.attachment;
    }

    public static class Builder {
        // required
        private String to;
        private String subject;
        //optional
        private String cc;
        private String body;
        private int priority;
        private boolean attachment;

        public Builder(String to, String subject) {
            this.to = to;
            this.subject = subject;
        }

        public Builder withCc(String cc) {
            this.cc = cc;
            return this;
        }

        public Builder withBody(String body) {
            this.body = body;
            return this;
        }

        public Builder withPriority(int priority) {
            this.priority = priority;
            return this;
        }

        public Builder withAttachment(boolean attachment) {
            this.attachment = true;
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
    private Email(Builder builder) {
        this.to = builder.to;
        this.subject = builder.subject;
        this.cc = builder.cc;
        this.body = builder.body;
        this.priority = builder.priority;
        this.attachment = builder.attachment;
    }

}
