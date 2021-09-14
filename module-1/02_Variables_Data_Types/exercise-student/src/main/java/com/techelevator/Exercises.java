package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

		int raccoonsPlaying = 3;
		int raccoonsEating = 2;
		int raccoonsLeftInWoods = raccoonsPlaying - raccoonsEating;
		System.out.println(raccoonsLeftInWoods);

        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */

		int flowers = 5;
		int bees = 3;
		int fewerBeesThanFlowers = flowers - bees;
		System.out.println(fewerBeesThanFlowers);


        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonelyPigeon = 1;
		lonelyPigeon += 1;
		int totalPigeons = lonelyPigeon;
		System.out.println(totalPigeons);


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int owlsOnFence = 3;
		owlsOnFence += 2;
		int totalOwlsOnFence = owlsOnFence;
		System.out.println(totalOwlsOnFence);


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int workingBeavers = 2;
		int swimmingBeavers = 1;
		int beaversStillWorking = workingBeavers - swimmingBeavers;
		System.out.println(beaversStillWorking);


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */

		int toucansOnTree = 2;
		toucansOnTree += 1;
		int totaltoucansOnTree = toucansOnTree;
		System.out.println(totaltoucansOnTree);

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */

		int squirrels = 4;
		int nuts = 2;
		int moreSquirrelsThanNuts = squirrels - nuts;
		System.out.println(moreSquirrelsThanNuts);


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */

		double quarter = .25;
		double dime = .10;
		double nickel = .05;
		double money = quarter + dime + (nickel * 2);
		System.out.println((float)money);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */

		int mrsBrierClassMuffins = 18;
		int mrsMacAdamClassMuffins = 20;
		int mrsFlanneryClassMuffins = 17;
		int totalFirstGradeMuffins = mrsBrierClassMuffins + mrsMacAdamClassMuffins + mrsFlanneryClassMuffins;
		System.out.println(totalFirstGradeMuffins);


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

		double yoyo = .24;
		double whistle = .14;
		double totalOfBothToys = yoyo + whistle;
		System.out.println(totalOfBothToys);


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

		int marshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = marshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows);


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */

		int snowMrsHiltHouse = 29;
		int snowBreacknockElementary = 17;
		int moreSnowAtMrsHiltHouse = snowMrsHiltHouse - snowBreacknockElementary;
		System.out.println(moreSnowAtMrsHiltHouse);


        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */

		int mrsHiltMoney = 10;
		int toyTruckCost = 3;
		int pencilCaseCost = 2;
		int moneyAfterPurchase = mrsHiltMoney - toyTruckCost - pencilCaseCost;
		System.out.println(moneyAfterPurchase);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */

		int joshMarbles = 16;
		int lostMarbles = 7;
		int collectionOfMarbles = joshMarbles - lostMarbles;
		System.out.println(collectionOfMarbles);


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */

		int targetSeashells = 25;
		int meganSeashells = 19;
		int neededSeashells = targetSeashells - meganSeashells;
		System.out.println(neededSeashells);


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */

		int bradBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = bradBalloons - redBalloons;
		System.out.println(greenBalloons);


        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */

		int booksOnShelf = 38;
		int booksAdded = 10;
		int totalBooksOnShelf = booksOnShelf + booksAdded;
		System.out.println(totalBooksOnShelf);


        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */

		int beeLegs = 6;
		int eightBees = 8;
		int eightBeesLegs = beeLegs * eightBees;
		System.out.println(eightBeesLegs);


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */

		double costOfIceCreamCone = .99;
		int twoCones = 2;
		double costOfTwoCones = costOfIceCreamCone * twoCones;
		System.out.println(costOfTwoCones);


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */

		int rocksForBorder = 125;
		int currentRocks = 64;
		int rocksNeeded = rocksForBorder - currentRocks;
		System.out.println(rocksNeeded);


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */

		int mrsHiltMarbles = 38;
		int marblesLost = 15;
		int marblesRemaining = mrsHiltMarbles - marblesLost;
		System.out.println(marblesRemaining);


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int milesToConcert = 78;
		int milesDrivenBeforeGas = 32;
		int milesRemainingAfterGass = milesToConcert - milesDrivenBeforeGas;
		System.out.println(milesRemainingAfterGass);

        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */

		double saturdayShovelingMinutes = 1.5 * 60;
		double sundayShovelingMinutes = .75 * 60;
		double totalShovelingMinutes = saturdayShovelingMinutes + sundayShovelingMinutes;
		System.out.println(totalShovelingMinutes);


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */

		int hotDogs = 6;
		float costOfHotDog = .50f;
		float costOfSixHotDogs = hotDogs * costOfHotDog;
		System.out.println(costOfSixHotDogs);


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */

		double hiltMoney = .50;
		double pencilCost = .070;
		double affordablePencils = hiltMoney / pencilCost;
		System.out.println(affordablePencils);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */

		int colorfulButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = colorfulButterflies - orangeButterflies;
		System.out.println(redButterflies);


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */

		double cashTendered = 1.00;
		double costOfCandy = .54;
		double changeDue = cashTendered - costOfCandy;
		System.out.println((float)changeDue);


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */

		int backyardTrees = 13;
		backyardTrees += 12;
		System.out.println(backyardTrees);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */

		int hoursInADay = 24;
		int daysTilSeeingGrandma = 2;
		int hoursTilJoySeesGrandma = hoursInADay * daysTilSeeingGrandma;
		System.out.println(hoursTilJoySeesGrandma);


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */

		int numberOfCousins = 4;
		int piecesOfGumPerCousin = 5;
		int totalPiecesOfGumNeeded = numberOfCousins * piecesOfGumPerCousin;
		System.out.println(totalPiecesOfGumNeeded);


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */

		int danMoney = 3;
		int candyBarCost = 1;
		int danRemainingMoney = danMoney - candyBarCost;
		System.out.println(danRemainingMoney);


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */

		short boatsInLake = 5;
		short peoplePerBoat = 3;
		int totalPeopleOnBoats = boatsInLake * peoplePerBoat;
		System.out.println(totalPeopleOnBoats);


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */

		short ellenLegos = 380;
		short lostLegos = 57;
		int remainingLegos = ellenLegos - lostLegos;
		System.out.println(remainingLegos);


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */

		int totalMuffins = 83;
		int bakedMuffins = 35;
		int muffinsNeeded = totalMuffins - bakedMuffins;
		System.out.println(muffinsNeeded);

        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */

		int crayonsWilly = 1400;
		int crayonsLucy = 290;
		int willyMoreCrayons = crayonsWilly - crayonsLucy;
		System.out.println(willyMoreCrayons);


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */

		int stickersPerPage = 10;
		int numberOfPages = 22;
		int totalStickers = stickersPerPage * numberOfPages;
		System.out.println(totalStickers);


        /* Exercise 39
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */

		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		int cupcakesPerPerson = numberOfCupcakes / numberOfChildren;
		System.out.println(cupcakesPerPerson);


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */

		int gingerBreadCookies = 47;
		int cookiesJarCanContain = 6;
		int cookiesNotInJars = gingerBreadCookies % cookiesJarCanContain;
		System.out.println(cookiesNotInJars);


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */

		int croissants = 59;
		int neighbors = 8;
		int croissantsForMarian = croissants % neighbors;
		System.out.println(croissantsForMarian);


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */

		int oatMealCookies = 276;
		int cookiesPerTray = 12;
		int traysNeeded = oatMealCookies / cookiesPerTray;
		System.out.println(traysNeeded);


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */

		int biteSizedPretzels = 480;
		int oneServingOfPretzels = 12;
		int servingsOfPretzels = biteSizedPretzels / oneServingOfPretzels;
		System.out.println(servingsOfPretzels);


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */

		int lemonCupcakes = 53;
		lemonCupcakes -= 2;
		int cupcakesPerBox = 3;
		int boxesOfLemonCupcakes = lemonCupcakes / cupcakesPerBox;
		System.out.println(boxesOfLemonCupcakes);


        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */

		int carrotSticks = 74;
		int peopleEatingCarrotSticks = 12;
		int leftoverCarrotSticks = carrotSticks % peopleEatingCarrotSticks;
		System.out.println(leftoverCarrotSticks);


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */

		int totalTeddyBears = 98;
		int teddyBearsPerShelf = 7;
		int shelvesFilled = totalTeddyBears / teddyBearsPerShelf;
		System.out.println(shelvesFilled);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

		int picturesForAlbum = 480;
		int picturesPerAlbum = 20;
		int albumsNeeded = picturesForAlbum / picturesPerAlbum;
		System.out.println(albumsNeeded);


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

		int tradingCards = 94;
		int fullBox = 8;
		int fullBoxOfCards = tradingCards / fullBox;
		int unfilledBox = tradingCards % fullBox;
		System.out.println(fullBoxOfCards);
		System.out.println(unfilledBox);


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */

		int dadBooks = 210;
		int dadShelves = 10;
		int booksPerShelf = dadBooks / dadShelves;
		System.out.println(booksPerShelf);


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

		int cristinaCroissants = 17;
		int sevenGuests = 7;
		int croissantsPerGuest = cristinaCroissants / sevenGuests;
		System.out.println(croissantsPerGuest);


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */

		int numberOfRooms = 5;
		double billHoursToPaintARoom = 2.15;
		double jillHoursToPaintARoom = 1.90;
		double feetInRoom = 12 * 14;

		double billHourlyRate = (billHoursToPaintARoom * feetInRoom) * numberOfRooms;
		double jillHourlyRate = (jillHoursToPaintARoom * feetInRoom) * numberOfRooms;

		double timeToPaintFiveRooms = (billHourlyRate + jillHourlyRate) / feetInRoom;
		System.out.println(timeToPaintFiveRooms);

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */

		String firstName = "Grace ";
		String middleInitial = "B.";
		String lastName = "Hopper, ";
		String fullName = lastName + firstName + middleInitial;
		System.out.println(fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */

		float newYorkToChicagoMiles = 800f;
		float milesTraveled = 537f;
		int percentageOfTripCompleted = (int) (milesTraveled / newYorkToChicagoMiles*100);
		System.out.println(percentageOfTripCompleted + "%");

	}

}
