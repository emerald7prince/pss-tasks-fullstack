import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Task } from './task';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private baseURL = "http://localhost:8080/tasks/";

  constructor(private httpClient: HttpClient) { }

  public findTasks(): Observable<Task[]> {
    return this.httpClient.get<Task[]>(this.baseURL);
  }
}
