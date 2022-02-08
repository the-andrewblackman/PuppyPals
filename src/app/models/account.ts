export class Account {
    
    constructor( public accountid:number, public username:string, public pass: string, public firstname: string, public lastname:string,public email: string,) {
        this.accountid = accountid;
        this.username = username;
        this.pass=pass;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        }
  }