import { render, screen, fireEvent } from '@testing-library/react';
import { Quotes } from './Quotes';

const quote = 'test quote';
const speaker = 'radom speaker';

test('renders receive quote, speaker and a button', () => {
  render(<Quotes quote={quote} speaker={speaker} />);

  const quoteEL = screen.getByText(quote);
  const speakerEL = screen.getByText(`- ${speaker}`);
  const buttonEL = screen.getByRole('button');

  expect(quoteEL).toBeInTheDocument();
  expect(speakerEL).toBeInTheDocument();
  expect(buttonEL).toBeInTheDocument();

})

test('calls a callback when button is pressed', () => {
  const callback = jest.fn();

  render(<Quotes quote={quote} speaker={speaker} onUpdate={callback} />);

  const buttonEL = screen.getByRole('button');

  fireEvent.click(buttonEL);

  expect(callback).toHaveBeenCalledTimes(1);
});