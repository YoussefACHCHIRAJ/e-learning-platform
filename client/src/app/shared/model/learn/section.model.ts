import { CategorySection } from "./category-section.model";
import { Course } from "./course.model";
import { MultimediaType } from "../common/multimedia-type.model";

export class Section {


    public id?: number;
    public label!: String;
    public code!: string;
    public pathMultimeadia?: string;
    public content!: string;
    public multimediaType!: MultimediaType| string;
    public course!: Course | string;
    public categorySection?: CategorySection;

}

