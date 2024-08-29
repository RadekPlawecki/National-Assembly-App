import { AppUser } from './app-user';
import { createContext, useContext } from 'react';

const ApiContext = createContext(new AppUser());

export default function ApiProvider({
  children,
}: {
  children: React.ReactNode;
}) {
  const apiClient = new AppUser();
  return (
    <ApiContext.Provider value={apiClient}>{children}</ApiContext.Provider>
  );
}

export function useApi() {
  return useContext(ApiContext);
}
