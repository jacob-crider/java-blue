package com.techelevator.auction;

public class BuyoutAuction extends Auction {

    private int buyoutPrice;

    // Constructor
    public BuyoutAuction(String itemForSale, int buyoutPrice) {
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid) {
        boolean isCurrentWinningBid = false;
        // if the buyout price is not met
        if (getHighBid().getBidAmount() < buyoutPrice) {
            // if the bid amount is greater than or equal to buyout - do something special
            if (offeredBid.getBidAmount() >= buyoutPrice) {
                offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice); // these parameters must be met in order to reassign the offeredBid
            }
            // otherwise do what is normal
            isCurrentWinningBid = super.placeBid(offeredBid);
        }

        return isCurrentWinningBid;
    }
}
