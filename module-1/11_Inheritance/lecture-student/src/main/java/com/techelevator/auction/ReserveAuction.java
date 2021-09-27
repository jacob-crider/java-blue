package com.techelevator.auction;

public class ReserveAuction extends Auction { // extends keyword lets us know we are in a subclass

    private int reservePrice;

    // Constructor
    public ReserveAuction(String itemForSale, int reservePrice) {
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        // is the offeredBid high enough?
        if (offeredBid.getBidAmount() >= reservePrice) {
           isCurrentWinningBid = super.placeBid(offeredBid); // assign the current winning bit do placeBid if the offeredBid is greater than the reservePrice
        }
        return isCurrentWinningBid;
    }
}
