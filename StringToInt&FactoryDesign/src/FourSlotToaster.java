public class FourSlotToaster implements Toaster{
    //Declare number of slot and type variables
    int numOfSlots;
    String typeOfSlots;

    //Defaulting to Regular in case Error is thrown while setting the slot type
    public FourSlotToaster(){
        this.numOfSlots = 4;
        this.typeOfSlots = "Regular";
    }

    @Override
    public void setTypeOfSlots(String type) throws Exception {
        //Set type to lowercase
        type = type.toLowerCase();
        //Error checking for invalid slot type
        if(type.equals("regular") || type.equals("wide")){
            this.typeOfSlots = type;
        }else{
            //Throw error message and type already set to Regular in constructor
            throw new Exception("Not a valid type! Defaulting to Regular!");
        }
    }
}
