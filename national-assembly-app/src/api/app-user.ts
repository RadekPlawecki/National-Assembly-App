import axios, { AxiosError, AxiosInstance, AxiosResponse } from 'axios';

export type ClientResponse<T> = {
  success: boolean;
  data: T;
  statusCode: number;
};

export class AppUser {
}
