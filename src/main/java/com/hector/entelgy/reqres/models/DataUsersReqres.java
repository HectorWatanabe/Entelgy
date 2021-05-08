package com.hector.entelgy.reqres.models;

import java.util.List;

public class DataUsersReqres {

    private final int page;
    private final int perPage;
    private final int total;
    private final int totalPages;
    private final List<UserReqres> userReqresList;

    public DataUsersReqres(int page, int perPage, int total, int totalPages, List<UserReqres> userReqresList) {
        this.page = page;
        this.perPage = perPage;
        this.total = total;
        this.totalPages = totalPages;
        this.userReqresList = userReqresList;
    }

    public int getPage() {
        return page;
    }

    public int getPerPage() {
        return perPage;
    }

    public int getTotal() {
        return total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<UserReqres> getUserReqresList() {
        return userReqresList;
    }

    @Override
    public String toString() {
        return "DataUsersReqres{" +
                "page=" + page +
                ", perPage=" + perPage +
                ", total=" + total +
                ", totalPages=" + totalPages +
                ", userReqresList=" + userReqresList +
                '}';
    }
}
