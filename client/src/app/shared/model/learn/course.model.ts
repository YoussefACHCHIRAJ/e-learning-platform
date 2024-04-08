import { Path } from "./path.model";

export class Course {
    public label!: string;
    public code!: string;
    public description!: string;
    public path!: Path;
    public sectionsNumbers?: number;
}
