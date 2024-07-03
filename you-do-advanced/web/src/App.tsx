import './App.css'
import {useEffect, useState} from "react";
import {User} from "./User.ts";

export default function App() {
    const {users} = useApp()

    return (
        <>
            <a href="https://docs.docker.com/compose/" target="_blank">
                <img src={"./compose.png"} className="logo react" alt="React logo"/>
            </a>
            <h2>Immersive WS</h2>
            <h1>Docker Compose Hands on</h1>
            <h4>Users</h4>
            {
                users.length === 0
                    ? <div>Nobody...</div>
                    : users.map(user => (
                        <div>{`${user.firstName} ${user.lastName}`}</div>
                    ))
            }
        </>
    )
}

function useApp() {
    const [users, setUsers] = useState<User[]>([])

    useEffect(() => {
        fetch('/api/users')
            .then(res => res.json())
            .then(data => {
                setUsers(data as User[])
            })
            .catch(error => console.log(error))
    }, []);

    return {users}
}