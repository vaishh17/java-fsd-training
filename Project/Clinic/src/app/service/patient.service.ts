import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Patient } from '../model/patient';

@Injectable({
  providedIn: 'root'
})
export class PatientService {
addPatientURL: string;
getPatientURL: string;
updatePatientURL: string;
deletePatientURL: string;
  constructor(private http : HttpClient) {
    this.addPatientURL='http://localhost:9091/patient/addPatient';
    this.getPatientURL='http://localhost:9091/patient/getAll';
    this.updatePatientURL='http://localhost:9091/patient/updatePatient';
    this.deletePatientURL='http://localhost:9091/patient/deletePatientById';
   }
   addPatient(ptn: Patient):Observable<Patient>{
     return this.http.post<Patient>(this.addPatientURL, ptn);
   }
   getAllPatient():Observable<Patient[]>{
    return this.http.get<Patient[]>(this.getPatientURL);
   }
   updatePatient(ptn:Patient):Observable<Patient>{
    return this.http.put<Patient>(this.updatePatientURL, ptn);
   }
   deletePatient(ptn: Patient): Observable<Patient>{
    return this.http.delete<Patient>(this.deletePatientURL+'/'+ ptn.id);
   }
}