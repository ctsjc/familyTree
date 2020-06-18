import {Component, OnInit} from '@angular/core';
import {PersonDTO} from '../jsons/person-dto';
import {PersonCrudService} from './person-crud.service';
import {AutoSuggestService} from '../auto/auto-suggest.service';


@Component({
  selector: 'app-add-member',
  templateUrl: './add-member.component.html',
  styleUrls: ['./add-member.component.css']
})
export class AddMemberComponent implements OnInit {
  gender: any;
  firstName: any;
  spouse: any;
  father: any;
  mother: any;
  public persons: Array<PersonDTO> = [];
  message: string;
  keyword = 'name';
  data = [
    {
      id: 1,
      name: 'Usa'
    },
    {
      id: 2,
      name: 'England'
    }
  ];


  titleString = 'Hello World';
  private rowData: PersonDTO[];
  myControl: any;
  options: any;
  someValue: any;

  constructor(private personService: PersonCrudService,
              private autosuggestService: AutoSuggestService) {
  }


  ngOnInit(): void {
    console.log(this.someValue);
    this.autosuggestService.changeMessage(this.someValue);
    this.autosuggestService.currentMessage.subscribe( value => {
      console.log( 'Value is : %s' , value);
    });
    this.getAll();
  }

  reset() {
    this.gender = '';
    this.firstName = '';
    this.spouse = '';
    this.father = '';
    this.mother = '';
    return 0;
  }

  save() {
    const personDTO: PersonDTO = {
      father: this.father ? this.father : '1',
      firstName: this.firstName ? this.firstName : '1',
      gender: this.gender ? this.gender : '1',
      mother: this.mother ? this.mother : '1',
      spouse: this.spouse ? this.spouse : '1'
    };
    console.log(JSON.stringify(personDTO));
    this.personService.savePerson(personDTO);
    return 0;
  }

  getAll() {
    this.personService.getPersons().subscribe(value => {
      this.persons = value as PersonDTO[];
    });
    console.log(JSON.stringify(this.persons));
  }


  selectEvent(item) {
    // do something with selected item
  }

  onChangeSearch(val: string) {
    // fetch remote data from here
    // And reassign the 'data' which is binded to 'data' property.
  }

  onFocused(e) {
    // do something when input is focused
  }

  changeFunction() {
    this.autosuggestService.changeMessage(this.someValue);

    console.log(this.someValue);
  }
}
