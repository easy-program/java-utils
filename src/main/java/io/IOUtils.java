package io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLConnection;
import java.nio.channels.Selector;

/**
 * io工具集合
 * 
 * @author: wuya
 * @version 1.0.0
 */
public class IOUtils {

	/**
	 * 
	 * Closes a URLConnection
	 * 
	 * @param conn the connection to close
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void close(final URLConnection conn) {
		if (conn instanceof HttpURLConnection) {
			((HttpURLConnection) conn).disconnect();
		}
	}

	/**
	 * 
	 * Closes an Reader unconditionally
	 * 
	 * @param input the Reader to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void closeQuietly(final Reader input) {
		closeQuietly((Closeable) input);
	}

	/**
	 * Closes an Writer unconditionally
	 * 
	 * @param output the Writer to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void closeQuietly(final Writer output) {
		closeQuietly((Closeable) output);
	}

	/**
	 * Closes an InputStream unconditionally
	 *
	 * @param input the InputStream to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void closeQuietly(final InputStream input) {
		closeQuietly((Closeable) input);
	}

	/**
	 * Closes an OutputStream unconditionally
	 *
	 * @param output the OutputStream to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void closeQuietly(final OutputStream output) {
		closeQuietly((Closeable) output);
	}

	/**
	 * Closes a Closeable unconditionally
	 *
	 * @param closeable the objects to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils @
	 */
	public static void closeQuietly(final Closeable closeable) {
		try {
			if (closeable != null) {
				closeable.close();
			}
		} catch (final IOException ioe) {
			// ignore
		}
	}

	/**
	 * Closes a Closeable unconditionally
	 *
	 * @param closeables the objects to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void closeQuietly(final Closeable... closeables) {
		if (closeables == null) {
			return;
		}
		for (final Closeable closeable : closeables) {
			closeQuietly(closeable);
		}
	}

	/**
	 * Closes a Socket unconditionally
	 *
	 * @param sock the Socket to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void closeQuietly(final Socket sock) {
		if (sock != null) {
			try {
				sock.close();
			} catch (final IOException ioe) {
				// ignored
			}
		}
	}

	/**
	 * Closes a Selector unconditionally
	 *
	 * @param selector the Selector to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void closeQuietly(final Selector selector) {
		if (selector != null) {
			try {
				selector.close();
			} catch (final IOException ioe) {
				// ignored
			}
		}
	}

	/**
	 * Closes a ServerSocket unconditionally
	 *
	 * @param sock the ServerSocket to close, may be null or already closed
	 * @see org.apache.commons.io.IOUtils
	 */
	public static void closeQuietly(final ServerSocket sock) {
		if (sock != null) {
			try {
				sock.close();
			} catch (final IOException ioe) {
				// ignored
			}
		}
	}

}
