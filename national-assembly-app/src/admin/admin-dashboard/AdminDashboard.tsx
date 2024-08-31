import Sidebar from "../../components/sidebar/Sidebar";
import Header from "../../components/header/Header";
import './AdminDashboard.css';

function AdminDashboard() {
    return (
        <div className="grid-container">
            <Sidebar />
            <Header />
        </div>
    );
}

export default AdminDashboard;