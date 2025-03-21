using System;
using System.Collections.Generic;

namespace TextEditor
{
    public class History
    {
        private readonly TextEditor _editor;
        private readonly List<EditorMemento> _history;
        private int _currentIndex;

        public History(TextEditor editor)
        {
            _editor = editor;
            _history = new List<EditorMemento>();
            _currentIndex = -1;
        }

        public void Backup()
        {
            var memento = _editor.CreateMemento();
            _history.Add(memento);
            _currentIndex++;
        }

        public void Undo()
        {
            if (_currentIndex <= 0)
            {
                Console.WriteLine("No previous state to restore.");
                return;
            }

            _currentIndex--;
            _editor.RestoreFromMemento(_history[_currentIndex]);
        }
    }
}