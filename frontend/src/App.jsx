import React, { useState, useEffect } from 'react';

// The URL of your Spring Boot backend endpoint
const API_URL = 'http://localhost:8080/api/drivers';

export default function App() {
  // 1. State variables to hold data from the backend
  const [drivers, setDrivers] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);
  const [search, setSearch] = useState('');

  // 2. Function to fetch data from Spring Boot backend
  const fetchDrivers = async (query = '') => {
    setLoading(true);
    setError(null);
    try {
      // If search query is provided, pass ?driver=... query param
      const url = query ? `${API_URL}?driver=${encodeURIComponent(query)}` : API_URL;
      
      // Makes an HTTP GET request to Spring Boot
      const response = await fetch(url);
      
      if (!response.ok) {
        throw new Error(`Server returned status: ${response.status}`);
      }
      
      // Parse the JSON array sent by Spring Boot
      const data = await response.json();
      setDrivers(data);
    } catch (err) {
      console.error('Error fetching drivers:', err);
      setError(err.message);
    } finally {
      setLoading(false);
    }
  };

  // 3. useEffect runs fetchDrivers automatically when the page loads
  useEffect(() => {
    fetchDrivers();
  }, []);

  const handleSearchSubmit = (e) => {
    e.preventDefault();
    fetchDrivers(search);
  };

  return (
    <div className="min-h-screen bg-black text-white p-6 font-mono">
      <div className="max-w-6xl mx-auto border border-zinc-800 p-8 rounded-lg shadow-2xl">
        
        {/* Header */}
        <header className="border-b border-zinc-800 pb-6 mb-8 flex flex-col md:flex-row justify-between items-start md:items-center gap-4">
          <div>
            <h1 className="text-3xl font-bold tracking-wider text-white uppercase">Formula 1 Stats</h1>
            <p className="text-zinc-400 text-sm mt-1">
              Connected to Spring Boot API at <code className="bg-zinc-900 px-2 py-0.5 rounded text-zinc-300">{API_URL}</code>
            </p>
          </div>

          {/* Search Form */}
          <form onSubmit={handleSearchSubmit} className="flex gap-2 w-full md:w-auto">
            <input
              type="text"
              placeholder="Search driver name..."
              value={search}
              onChange={(e) => setSearch(e.target.value)}
              className="bg-zinc-900 border border-zinc-700 text-white text-sm rounded px-3 py-2 outline-none focus:border-white transition-colors w-full md:w-64"
            />
            <button
              type="submit"
              className="bg-white text-black text-sm font-semibold px-4 py-2 rounded hover:bg-zinc-200 transition-colors cursor-pointer"
            >
              Search
            </button>
          </form>
        </header>

        {/* How it works explanation for beginner */}
        <div className="bg-zinc-950 border border-zinc-800 p-4 rounded mb-8 text-xs text-zinc-400 leading-relaxed">
          <span className="text-white font-bold">💡 How Frontend Connects to Backend:</span> This React app uses <code className="text-zinc-200">fetch()</code> to send an HTTP GET request to your Java Spring Boot backend at <code className="text-zinc-200">http://localhost:8080/api/drivers</code>. When Spring Boot responds with JSON data, React saves it in state using <code className="text-zinc-200">setDrivers(data)</code> and renders the table below.
        </div>

        {/* Loading & Error States */}
        {loading && (
          <div className="text-center py-12 text-zinc-500 animate-pulse">
            Loading drivers from Spring Boot backend...
          </div>
        )}

        {error && (
          <div className="bg-red-950/40 border border-red-800 text-red-300 p-4 rounded text-sm mb-6">
            <strong>Backend Error:</strong> Could not connect to Spring Boot server ({error}). Ensure backend is running on port 8080 with <code>./mvnw spring-boot:run</code>.
          </div>
        )}

        {/* Drivers Table */}
        {!loading && !error && (
          <div className="overflow-x-auto border border-zinc-800 rounded">
            <table className="w-full text-left text-sm text-zinc-300">
              <thead className="bg-zinc-900 text-xs uppercase text-zinc-400 border-b border-zinc-800">
                <tr>
                  <th className="py-3 px-4">Driver</th>
                  <th className="py-3 px-4">Nation</th>
                  <th className="py-3 px-4">Constructor</th>
                  <th className="py-3 px-4">Age</th>
                  <th className="py-3 px-4">Wins</th>
                  <th className="py-3 px-4">Podiums</th>
                  <th className="py-3 px-4">Points</th>
                </tr>
              </thead>
              <tbody className="divide-y divide-zinc-800">
                {drivers.length === 0 ? (
                  <tr>
                    <td colSpan="7" className="text-center py-8 text-zinc-500">
                      No drivers found matching your search.
                    </td>
                  </tr>
                ) : (
                  drivers.map((d, index) => (
                    <tr key={d.driver || index} className="hover:bg-zinc-900/60 transition-colors">
                      <td className="py-3 px-4 font-semibold text-white">{d.driver}</td>
                      <td className="py-3 px-4">{d.nation}</td>
                      <td className="py-3 px-4">{d.constructor}</td>
                      <td className="py-3 px-4">{d.age}</td>
                      <td className="py-3 px-4">{d.wins}</td>
                      <td className="py-3 px-4">{d.podiums}</td>
                      <td className="py-3 px-4 font-bold text-white">{d.pts}</td>
                    </tr>
                  ))
                )}
              </tbody>
            </table>
          </div>
        )}

      </div>
    </div>
  );
}
