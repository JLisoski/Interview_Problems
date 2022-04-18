
public class ToasterFactory {
    //Function to create Toaster Instances with desired number of slots and slot types.
    //I've made the assumption that in case of invalid slot type, the toaster defaults to regular.

    public Toaster createToaster(int numOfSlots, String typeOfSlots) throws Exception {
        if(numOfSlots == 2){
            //Declare a two slot toaster
            TwoSlotToaster current = new TwoSlotToaster();
            //Try to set the type of slots and catch any exceptions
            try {
                current.setTypeOfSlots(typeOfSlots);
            }catch (Exception e){
                return current;
            }
            //If no exception, return toaster with passed type
            System.out.println("Returning a Brand New TwoSlot Toaster with " + typeOfSlots + " slots!");
            return current;
        }else if(numOfSlots == 4){
            //Declare a four slot toaster
            FourSlotToaster current = new FourSlotToaster();
            //Try to set the type of slots and catch any exceptions
            try {
                current.setTypeOfSlots(typeOfSlots);
            }catch (Exception e){
                return current;
            }
            //If no exception, return toaster with passed type
            System.out.println("Returning a Brand New FourSlot Toaster with " + typeOfSlots + " slots!");
            return current;
        }else{
            //If numOfSlots not valid, output message and return a TwoSlot Toaster
            System.out.println("Invalid number of Slots! Default to a TwoSlot Toaster with Regular Slots!");
            return new TwoSlotToaster();
        }
    }

}
