package com.techelevator.services;

import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import com.techelevator.models.Auction;

import javax.print.attribute.standard.PresentationDirection;
import java.io.BufferedWriter;

public class AuctionService {

    public static final String BASE_URL = "http://localhost:3000/auctions";
    public RestTemplate restTemplate = new RestTemplate();
    private final ConsoleService console = new ConsoleService();


    public Auction[] listAllAuctions() {
        Auction[] auctions = restTemplate.getForObject("http://localhost:3000/auctions", Auction[].class);
        return auctions;
    }

    public Auction listDetailsForAuction(int id) {
        String url = "http://localhost:3000/auctions/" + id;
        Auction auction = restTemplate.getForObject(url, Auction.class);
        return auction;
    }

    public Auction[] findAuctionsSearchTitle(String title) {
        String url = BASE_URL + "?title_like=" + title;
        Auction[] auctions = restTemplate.getForObject(url, Auction[].class);
        return auctions;
    }

    public Auction[] findAuctionsSearchPrice(double price) {
        String url = BASE_URL + "?currentBid_lte=" + price;
        Auction[] auctions = restTemplate.getForObject(url, Auction[].class);
        return auctions;
    }

}
