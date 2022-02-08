export class Account {
    id: number;
    username: string;
    pass: string;
    firstname: string;
    lastname: string;
    email: string;
  
    constructor(id: number, username: string, pass: string, firstname: string, lastname: string, email: string) {
      this.id = id;
      this.username = username;
      this.pass = pass;
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
    }
}