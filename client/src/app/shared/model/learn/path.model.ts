import { PathStatus } from "./path-status.model";

export class Path {
    public code!: String;
    public description!: String;
    public label!:String;
    public pathStatus!: PathStatus;
    public courseNumbers?: number;
}
