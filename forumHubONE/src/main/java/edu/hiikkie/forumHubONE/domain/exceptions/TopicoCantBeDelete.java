package edu.hiikkie.forumHubONE.domain.exceptions;

public class TopicoCantBeDelete extends RuntimeException{
    public TopicoCantBeDelete(String message) {
        super(message);
    }
}
