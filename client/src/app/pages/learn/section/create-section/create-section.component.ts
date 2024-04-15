import { Component, OnInit } from '@angular/core';
import { StepperService } from '../../../../shared/service/stepper.service';
import { Router } from '@angular/router';
import { SectionService } from '../../../../shared/service/learn/section.service';
import { CourseService } from '../../../../shared/service/learn/course.service';
import { Course } from '../../../../shared/model/learn/course.model';
import { Section } from '../../../../shared/model/learn/section.model';
import { PathService } from '../../../../shared/service/learn/path.service';
import { RequestBodyInterface } from '../../../../types';

interface SectionsNumberArrayInterface {
  course: string;
  sections: number[];
}

@Component({
  selector: 'app-create-section',
  standalone: true,
  imports: [],
  templateUrl: './create-section.component.html',
  styleUrl: './create-section.component.css',
})
export class CreateSectionComponent implements OnInit {
  private _sectionsNumbersArray: SectionsNumberArrayInterface[] = [];

  constructor(
    private stepperService: StepperService,
    private router: Router,
    private sectionService: SectionService,
    private pathService: PathService,
    private courseService: CourseService
  ) {}
  ngOnInit(): void {
    this.initialSectionsNumbersArray();
  }

  incrementStepper() {
    this.stepperService.stepperCounter = 3;
    this.extractSectionsInfo();
    const requestBody: RequestBodyInterface = {
      path: this.pathService.path,
      courses: this.courses,
      sections: this.sections,
    };
    this.pathService.save().subscribe((data) => {
      if (data) {
        this.router.navigate(['dashboard/paths']);
      } else {
        console.log({ data });
      }
    });
  }
  descrementStepper() {
    this.stepperService.stepperCounter = 1;
    this.router.navigate(['paths/create/cours-info']);
  }

  public get course(): Course {
    return this.courseService.course;
  }
  public get courses(): Course[] {
    return this.courseService.courses;
  }

  public get sectionsNumbersArray(): SectionsNumberArrayInterface[] {
    return this._sectionsNumbersArray;
  }
  public set sectionsNumbersArray(value: SectionsNumberArrayInterface[]) {
    this._sectionsNumbersArray = value;
  }

  public get section(): Section {
    return this.sectionService.section;
  }
  public set section(value: Section) {
    this.sectionService.section = value;
  }

  public get sections(): Array<Section> {
    return this.sectionService.sections;
  }
  public set sections(value: Array<Section>) {
    this.sectionService.sections = value;
  }

  initialSectionsNumbersArray() {
    for (const course of this.courses) {
      const sectionSubInfo = {
        course: course.code,
        sections: Array.from(
          { length: course.sectionsNumbers! | 0 },
          (_, index) => index + 1
        ),
      };
      this.sectionsNumbersArray.push(sectionSubInfo);
    }
  }

  public get requestBody(): RequestBodyInterface {
    return this.pathService.requestBody;
  }
  public set requestBody(value: RequestBodyInterface) {
    this.pathService.requestBody = value;
  }

  extractSectionsInfo() {
    for (const course of this.sectionsNumbersArray) {
      for (const section of course.sections) {
        const label = document.getElementById(
          `course-${course.course}-section-${section}-label`
        ) as HTMLInputElement;
        const mediaType = document.getElementById(
          `course-${course.course}-section-${section}-media`
        ) as HTMLInputElement;
        const content = document.getElementById(
          `course-${course.course}-section-${section}-content`
        ) as HTMLInputElement;
        this.section = {
          label: label.value,
          code: label.value.toLocaleLowerCase(),
          content: content.value,
          multimediaType: mediaType.value,
          course: course.course,
        };
        if (this.sections) {
          this.sections = [...this.sections, this.section];
        } else {
          this.sections = [this.section];
        }
      }
    }
  }
}
