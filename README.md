# Harvard Python Training Project

## 📚 Project Overview

This repository contains my journey through Harvard's Python programming course. This project demonstrates my progression in Python programming, from fundamental concepts to advanced topics covered in the Harvard curriculum.

## 🎯 Learning Objectives

- Master Python fundamentals and syntax
- Understand object-oriented programming principles
- Learn data structures and algorithms
- Practice problem-solving with Python
- Develop clean, maintainable code
- Apply best practices in software development

## 📁 Project Structure

```
PYTHON_CLASS-HAVARD/
├── README.md                 # This file
├── assignments/              # Course assignments and exercises
├── projects/                 # Major projects and applications
├── practice/                 # Practice problems and coding challenges
├── notes/                    # Course notes and documentation
└── resources/                # Additional learning materials
```

## 🚀 Getting Started

### Prerequisites

- Python 3.8 or higher
- pip (Python package installer)
- Git (for version control)

### Installation

1. Clone this repository:
```bash
git clone https://github.com/yourusername/PYTHON_CLASS-HAVARD.git
cd PYTHON_CLASS-HAVARD
```

2. Create a virtual environment (recommended):
```bash
python -m venv venv
source venv/bin/activate  # On Windows: venv\Scripts\activate
```

3. Install required packages:
```bash
pip install -r requirements.txt
```

## 📖 Course Content

### Topics Covered

- **Python Basics**
  - Variables and data types
  - Control structures (if/else, loops)
  - Functions and modules
  - Error handling

- **Data Structures**
  - Lists, tuples, dictionaries
  - Sets and their operations
  - String manipulation

- **Object-Oriented Programming**
  - Classes and objects
  - Inheritance and polymorphism
  - Encapsulation and abstraction

- **Advanced Topics**
  - File I/O operations
  - Exception handling
  - Regular expressions
  - Working with APIs
  - Data analysis with pandas

## 🛠️ Projects and Assignments

### Assignment 1: Python Fundamentals
- Basic syntax and data types
- Control flow and functions
- Simple algorithms

### Assignment 2: Data Structures
- Working with lists and dictionaries
- String processing
- File operations

### Assignment 3: Object-Oriented Programming
- Class design and implementation
- Inheritance hierarchies
- Method overriding

### Final Project: [Project Name]
- Comprehensive application demonstrating all learned concepts
- Real-world problem solving
- Clean code practices

## 📝 Code Examples

### Basic Function Example
```python
def calculate_fibonacci(n):
    """Calculate the nth Fibonacci number."""
    if n <= 1:
        return n
    return calculate_fibonacci(n-1) + calculate_fibonacci(n-2)

# Example usage
result = calculate_fibonacci(10)
print(f"Fibonacci(10) = {result}")
```

### Class Example
```python
class Student:
    def __init__(self, name, student_id):
        self.name = name
        self.student_id = student_id
        self.grades = []
    
    def add_grade(self, grade):
        self.grades.append(grade)
    
    def get_average(self):
        return sum(self.grades) / len(self.grades) if self.grades else 0
```

## 🧪 Testing

Run tests to verify your implementations:

```bash
python -m pytest tests/
```

## 📊 Progress Tracking

- [x] Python Basics
- [x] Data Structures
- [x] Functions and Modules
- [x] Object-Oriented Programming
- [ ] File I/O and Exception Handling
- [ ] Advanced Topics
- [ ] Final Project

## 🤝 Contributing

This is a personal learning repository. If you have suggestions or find issues:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Submit a pull request

## 📚 Resources

- [Python Official Documentation](https://docs.python.org/3/)
- [Harvard CS50 Python Course](https://cs50.harvard.edu/python/)
- [Python.org Tutorial](https://docs.python.org/3/tutorial/)
- [Real Python](https://realpython.com/)

## 📄 License

This project is for educational purposes as part of Harvard's Python course.

## 👨‍💻 Author

**Henrique** - Harvard Python Training Student

## 📞 Contact

- GitHub: [@yourusername](https://github.com/yourusername)
- Email: your.email@example.com

---

*This repository represents my learning journey through Harvard's Python programming course. Each commit reflects my understanding and application of Python concepts taught in the curriculum.*