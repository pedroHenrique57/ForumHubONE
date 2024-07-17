package edu.hiikkie.forumHubONE.domain.exceptions;

public class CursoCantBeDelete extends RuntimeException{
    public CursoCantBeDelete(String message) {
        super(message);
    }
}
