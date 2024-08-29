import React from 'react';
import './App.css';
import { BrowserRouter, Navigate, Route, Routes } from 'react-router-dom';
import { I18nextProvider } from 'react-i18next';
import i18n from './i18n';
import ApiProvider from './api/ApiProvider';
import AdminDashboard from './admin/admin-dashboard/AdminDashboard';


function App() {
  return (
    <BrowserRouter>
      <I18nextProvider i18n={i18n}>
            <ApiProvider>
                <Routes>
                    <Route path="/" element={<Navigate to="/dashboard" />} />
                    <Route path="/dashboard" element={<AdminDashboard />} />
                </Routes>
            </ApiProvider>
      </I18nextProvider>
    </BrowserRouter>
  );
}

export default App;