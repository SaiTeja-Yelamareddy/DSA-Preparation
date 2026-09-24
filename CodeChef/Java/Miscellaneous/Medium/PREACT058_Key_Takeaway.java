/*
 * Platform: CodeChef
 * Problem ID: PREACT058
 * Problem: Key Takeaway
 * Problem Link: https://www.codechef.com/learn/course/react-js/CREACT014/problems/PREACT058
 * Language: Java
 * Concept: Miscellaneous
 * Difficulty: Medium
 * Course: React Js
 * Module: CREACT014
 * Status: ACCEPTED
 */

      }
    };
    
    window.addEventListener('keydown', handleKeyPress);
    return () => window.removeEventListener('keydown', handleKeyPress);
  }, []); // Empty dependency array

  return (
    <div>
      <button onClick={() => setIsOn(!isOn)}>
        Toggle Light (Button)
      </button>
      <p>Light is {isOn ? "ON 🌟" : "OFF 🌑"}</p>
      <small>Press "L" key to toggle!</small>
    </div>
  );
}

export default LightSwitch;