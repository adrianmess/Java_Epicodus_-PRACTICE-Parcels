Create a basic application that prompts users to provide the dimensions and weight of a package. Then, return the cost to ship the package

- Create a Parcel class.
- You should be able to create a new Parcel and specify the dimensions and weight in the arguments.
- Create a volume() method that calculates the volume of a Parcel using its dimensions.
- Once you're able to successfully calculate volume, create a costToShip() method that returns how much this Parcel will cost to ship somewhere.
	- You should offer users different options for speed of delivery, distance, dimensions, and weight ranges to choose from.
	- Your formula should take these options into account, and calculate a cost to ship accordingly (for instance, a heavier package should cost more to ship than a lighter package. It should cost more for one-day shipping than five-day shipping, etc.)
- Offer gift wrapping services that require the surface area of the Parcel to determine cost (ie: A Parcel with a surface area of 36 inches should cost less to add gift wrapping to than one with a surface area of 108 inches) The cost for gift wrapping should be added to the total shipping cost.
- Consider offering discounts based on size, date or some other property of your choosing.
- Add functionality to your command line interface that allows your program to continually run.
- Allow users to ship multiple parcels in one "session". Keep track of each, and provide the user a "receipt" listing all Parcels they have shipped, the extra options (like gift wrapping) they've included, and the cost.