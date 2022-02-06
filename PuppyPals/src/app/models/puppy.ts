export class puppy{
public id: String;
public training_time: Number;
public foodConsumption: String;
public excerciseRoutine:String;
public energy:Number;
public friendliness: Number;
public affectionLevel:Number;
public shedding: Number;

constructor( id: String, training_time: Number,
            foodConsumption: String,
            excerciseRoutine:String,
            energy:Number,
            friendliness: Number,
            affectionLevel:Number,
            shedding: Number)

    {
    this.id =id;
    this.training_time=training_time;
    this.foodConsumption=foodConsumption;
     this.excerciseRoutine=excerciseRoutine;
     this.energy=energy;
     this.friendliness=friendliness;
    this.affectionLevel=affectionLevel;
    this.shedding=shedding;
    }
 }