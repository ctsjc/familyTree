import {Injectable} from '@angular/core';
import {Observable, throwError} from 'rxjs';
import {PersonDTO} from '../jsons/person-dto';
import {HttpClient, HttpErrorResponse, HttpHeaders, HttpParams} from '@angular/common/http';
import {catchError} from 'rxjs/operators';


// @ts-ignore
@Injectable({
  providedIn: 'root'
})
export class PersonCrudService {

  personUrl = 'http://127.0.0.1:8080/';
  customersObservable: Observable<any>;
  HandleRequiredErrorResponse: any;

  constructor(private  httpClient: HttpClient) {
  }

  getPersons() {

    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    return this.httpClient.request('GET', this.personUrl + 'getAll', httpOptions);
  }

  savePerson(personDTO: PersonDTO) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };
    const personSaveUrl = this.personUrl + 'save';
    const testUrl = 'http://httpbin.org/post';
    this.httpClient.post<PersonDTO>(personSaveUrl, personDTO, httpOptions)
      .pipe(
        catchError(err => this.HandleRequiredErrorResponse(err))
      ).subscribe(data => console.log(data));
  }


}
