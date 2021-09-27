package com.techelevator.auction;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Jenny", 13));

        System.out.println("This is our auction:");
        for (Bid currentBid : generalAuction.getAllBids()) {
            System.out.println(currentBid.getBidder() + ": " + currentBid.getBidAmount());
        }

        System.out.println("Highest Bidder for general auction:");
        System.out.println(generalAuction.getHighBid().getBidder() + ": " + generalAuction.getHighBid().getBidAmount());

        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

    }
}
