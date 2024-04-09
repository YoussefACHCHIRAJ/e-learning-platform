import { PathStatus } from './path-status.model';

export class Path {
  public code!: string;
  public description!: string;
  public label!: string;
  public pathStatus!: PathStatus;
  public courseNumbers?: number;
}
