import { CategorySection } from "./category-section.model";
import { Course } from "./course.model";
import { MultimediaType } from "./multimedia-type.model";

export class Section {


    public id:number;
    public label:String;
    public code :string;
    public pathMultimeadia :string;
    public content :string;
    public multimediaType: MultimediaType;
    public course :Course;
    public categorySection :CategorySection;

}

