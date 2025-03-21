using System;
using System.Collections.Generic;

namespace TextEditor
{
    public class TextEditor
    {
        private string _content;
        private int _cursorPosition;
        private List<string> _selections;

        public TextEditor()
        {
            _content = string.Empty;
            _cursorPosition = 0;
            _selections = new List<string>();
        }

        public void SetContent(string content)
        {
            _content = content;
        }

        public void SetCursorPosition(int position)
        {
            if (position < 0 || position > _content.Length)
                throw new ArgumentOutOfRangeException(nameof(position), "Cursor position is out of range.");
            _cursorPosition = position;
        }

        public void AddSelection(string selection)
        {
            _selections.Add(selection);
        }

        public void ClearSelections()
        {
            _selections.Clear();
        }

        public EditorMemento CreateMemento()
        {
            return new EditorMemento(_content, _cursorPosition, new List<string>(_selections));
        }

        public void RestoreFromMemento(EditorMemento memento)
        {
            _content = memento.Content;
            _cursorPosition = memento.CursorPosition;
            _selections = new List<string>(memento.Selections);
        }

        public void DisplayState()
        {
            Console.WriteLine($"Content: {_content}");
            Console.WriteLine($"Cursor Position: {_cursorPosition}");
            Console.WriteLine($"Selections: {string.Join(", ", _selections)}");
        }
    }
}