package net.apmoller.athena.microservices.comparatordashboard.models;

public class ComparatorDashboard {
    private String date;
    private int filesgenerated;
    private int filesworking;
    private int analysed;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFilesgenerated() {
        return filesgenerated;
    }

    public void setFilesgenerated(int filesgenerated) {
        this.filesgenerated = filesgenerated;
    }

    public int getFilesworking() {
        return filesworking;
    }

    public void setFilesworking(int filesworking) {
        this.filesworking = filesworking;
    }

    public int getAnalysed() {
        return analysed;
    }

    public void setAnalysed(int analysed) {
        this.analysed = analysed;
    }

}
