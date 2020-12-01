package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private String commentAnswer;
    private int commentAnswerCount;
    private String commentDate;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean getCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getCommentAnswer() {
        return commentAnswer;
    }

    public void setCommentAnswer(String commentAnswer) {
        this.commentAnswer = commentAnswer;
    }

    public int getCommentAnswerCount() {
        return commentAnswerCount;
    }

    public void setCommentAnswerCount(int commentAnswerCount) {
        this.commentAnswerCount = commentAnswerCount;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

}
