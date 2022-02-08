export class KennelTable {

  constructor(public id:number, public dogid:number, public accountid:number, public dogname:string,
    public dogage:number ) {
    this.id = id;
    this.dogid = dogid;
    this.accountid = accountid;
    this.dogname = dogname;
    this.dogage = dogage;
  }
}