import { Injectable } from '@angular/core';
import {BehaviorSubject} from 'rxjs';
import {PersonCrudService} from '../add-member/person-crud.service';
import {Person} from '../schema/person';

@Injectable({
  providedIn: 'root'
})
export class AutoSuggestService {
  count: number;
  private messageSource = new BehaviorSubject('default message');
  currentMessage = this.messageSource.asObservable();


  constructor() {
    this.count = 1000;
  }

  changeMessage(message: string) {
    this.count += 1;
    this.messageSource.next((message + '--' + this.count));

    this.readFromCache(message);
  }


  private readFromCache(message: string): Person[]{
    // tslint:disable-next-line:prefer-const
      return [];
  }
}
