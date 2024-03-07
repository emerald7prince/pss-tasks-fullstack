import { Component, OnInit } from '@angular/core';

import { TaskService } from '../task.service';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrl: './task-list.component.css'
})
export class TaskListComponent implements OnInit{

  protected tasks: any;

  constructor(private taskService: TaskService) { };

  ngOnInit(): void {
      this.getTasks();
  }

  private getTasks() {
    this.taskService.findTasks().subscribe(data => {
      this.tasks = data;
    });
  }
}
