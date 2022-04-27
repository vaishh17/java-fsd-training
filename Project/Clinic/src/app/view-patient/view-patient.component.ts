import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl} from '@angular/forms'
import { Patient } from 'src/app/model/patient';
import { PatientService } from 'src/app/service/patient.service';

@Component({
  selector: 'app-view-patient',
  templateUrl: './view-patient.component.html',
  styleUrls: ['./view-patient.component.css']
})
export class ViewPatientComponent implements OnInit {

  patientDetail !: FormGroup;
  patientObj: Patient=new Patient();
  patientList: Patient[]=[];

  constructor(private formBuilder : FormBuilder, private patientService:PatientService) { }

  ngOnInit(): void {

    this.getAllPatient();
    this.patientDetail = this.formBuilder.group({
      id: [''],
      name: [''],
      email: [''],
      diagnosis: [''],
      treatment: ['']
    });
  }
  addPatient(){
    console.log(this.patientDetail);
    this.patientObj.id=this.patientDetail.value.id;
    this.patientObj.name=this.patientDetail.value.name;
    this.patientObj.email=this.patientDetail.value.email;
    this.patientObj.diagnosis=this.patientDetail.value.diagnosis;
    this.patientObj.treatment=this.patientDetail.value.treatment;
    this.patientService.addPatient(this.patientObj).subscribe(res=>{
      console.log(res);
      this.getAllPatient();
     },err=>{
      console.log(err);
      });
}
getAllPatient(){
    this.patientService.getAllPatient().subscribe(res=>{
    this.patientList=res;
},err=>{
  console.log("Error while fetching data.")
});
}
editPatient(ptn:Patient){
  this.patientDetail.controls['id'].setValue(ptn.id);
  this.patientDetail.controls['name'].setValue(ptn.name);
  this.patientDetail.controls['email'].setValue(ptn.email);
  this.patientDetail.controls['diagnosis'].setValue(ptn.diagnosis);
  this.patientDetail.controls['treatment'].setValue(ptn.treatment);
}
updatePatient(){
  this.patientObj.id=this.patientDetail.value.id;
  this.patientObj.name=this.patientDetail.value.name;
  this.patientObj.email=this.patientDetail.value.email;
  this.patientObj.diagnosis=this.patientDetail.value.diagnosis;
  this.patientObj.treatment=this.patientDetail.value.treatment;
  this.patientService.updatePatient(this.patientObj).subscribe(res=>{
    console.log(res);
    this.getAllPatient();
},err=>{
  console.log(err);
});
}
deletePatient(ptn: Patient){
  this.patientService.deletePatient(ptn).subscribe(res=>{
    console.log(res);
    alert('Patient deleted successfully');
    this.getAllPatient();

  },err=>{
    console.log(err);
  })
}

}
